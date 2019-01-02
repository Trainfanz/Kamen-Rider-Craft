package KamenRiderCraftV3;


import KamenRiderCraftV3.mobs.EntityAnkh;
import KamenRiderCraftV3.mobs.EntityBugsterVirus;
import KamenRiderCraftV3.mobs.EntityChronos;
import KamenRiderCraftV3.mobs.EntityMasquerade;
import KamenRiderCraftV3.mobs.EntityPoppy;
import KamenRiderCraftV3.mobs.Entitygamma_commando;
import KamenRiderCraftV3.mobs.Entityguardian;
import KamenRiderCraftV3.mobs.Entityshocker_combatman;
import KamenRiderCraftV3.mobs.RenderRiderMob;
import KamenRiderCraftV3.mobs.RenderRiderMob2;
import KamenRiderCraftV3.model.ModelAnkh;
import KamenRiderCraftV3.model.ModelPoppy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxyRider extends CommonProxyRider
{

	@Override
	public void isboss(IBossDisplayData thisboss) {
		  BossStatus.setBossStatus(thisboss, true);
	}
	@Override
    public void registerRenderThings()
    {

		RiderItems.RegisterRenders();
		
		//registerEntityRenderingHandler(EntityMasquerade.class, RenderNewMob::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMasquerade.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/masquerade.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityAnkh.class, new RenderRiderMob(new ModelAnkh(0), 0.5F,"textures/entities/ankh.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBugsterVirus.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/bugster_virus.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entitygamma_commando.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/gamma_commandos.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entityshocker_combatman.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/shocker_combatman.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entityguardian.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/guardian.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityChronos.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/chronos.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPoppy.class, new RenderRiderMob2(new ModelPoppy(), 0.5F,"textures/entities/poppy.png"));
}
}
