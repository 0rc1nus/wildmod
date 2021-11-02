package frozenblock.wild.mod.entity;

import frozenblock.wild.mod.WildMod;
import frozenblock.wild.mod.WildModClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class WardenEntityRenderer extends MobEntityRenderer<WardenEntity, WardenEntityModel> {

    public WardenEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new WardenEntityModel(context.getPart(WildModClient.MODEL_WARDEN_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(WardenEntity entity) {
        return new Identifier(WildMod.MOD_ID, "textures/entity/warden/warden.png");
    }

}