package dev.fernaerell.aerellcrafter.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CrafterBlock;
import net.minecraft.world.level.block.entity.CrafterBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.world.level.block.CrafterBlock.TRIGGERED;

@Mixin(CrafterBlock.class)
abstract class CrafterBlockMixin {

    @Unique
    private boolean aerellcrafter$isTemplatedOrEmpty(Level world, BlockPos pos) {
        return world.getBlockEntity(pos) instanceof CrafterBlockEntity crafterBlockEntity && (crafterBlockEntity.isEmpty() || crafterBlockEntity.getItems().stream().anyMatch(itemStack -> itemStack.getCount() == 1));
    }

    @Inject(method = "neighborChanged", at = @At("HEAD"), cancellable = true)
    private void neighborChangedInject(BlockState state, Level world, BlockPos pos, Block sourceBlock, Orientation wireOrientation, boolean notify, CallbackInfo ci) {
        if(this.aerellcrafter$isTemplatedOrEmpty(world, pos) && !world.getBlockState(pos).getValue(TRIGGERED)) ci.cancel();
    }

    @Inject(method = "dispenseFrom", at = @At("HEAD"), cancellable = true)
    private void dispenseFromInject(BlockState state, ServerLevel world, BlockPos pos, CallbackInfo ci) {
        if(this.aerellcrafter$isTemplatedOrEmpty(world, pos)) ci.cancel();
    }
}
