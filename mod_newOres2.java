package net.minecraft.src;

import java.util.Random;

public class mod_newOres2 extends BaseMod {
	public static final Block BHO = (new Block(168, Material.rock))
			.setHardness(5.0F).setResistance(10F).setBlockName("BHO");
	public static final Block RB = (new Block(164, Material.rock))
			.setHardness(2.0F).setResistance(10F).setBlockName("RB").setLightValue(3F);
	public static final Block ZO = (new Block(166, Material.rock))
			.setHardness(5.0F).setResistance(10F).setBlockName("ZO");
	public static final Block SO = (new Block(165, Material.rock))
			.setHardness(5.0F).setResistance(10F).setBlockName("SO");
	public static final Block RO = (new Block(167, Material.rock))
			.setHardness(5.0F).setResistance(10F).setBlockName("RO");
	

	public int quantityDropped(Random random) {
		return 1;
	}

	public void generateSurface(World world, Random rand, int y, int z) {
		for (int a = 0; a < 2; a++) {
			int i = y + rand.nextInt(16);
			int j = rand.nextInt(20);
			int k = z + rand.nextInt(16);
			(new WorldGenMinable(mod_newOres2.ZO.blockID, 15)).generate(world,
					rand, i, j, k);
		}
		for (int a = 0; a < 5; a++) {
			int i = y + rand.nextInt(16);
			int j = rand.nextInt(50);
			int k = z + rand.nextInt(16);
			
			(new WorldGenMinable(mod_newOres2.RO.blockID, 15)).generate(world,
					rand, i, j, k);}
		for (int a = 0; a < 3; a++) {
			int i = y + rand.nextInt(16);
			int j = rand.nextInt(35);
			int k = z + rand.nextInt(16);
			(new WorldGenMinable(mod_newOres2.SO.blockID, 15)).generate(world,
						rand, i, j, k);}
		
			
		}
	

	public mod_newOres2() {

	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void load() {
		ModLoader.registerBlock(RB);
		ModLoader.registerBlock(ZO);
		ModLoader.registerBlock(SO);
		ModLoader.registerBlock(RO);
		;

		ModLoader.addName(RB, "Redstone Block");
		ModLoader.addName(SO, "Sapphire Ore");
		ModLoader.addName(ZO, "Zircon Ore");
		ModLoader.addName(RO, "Ruby Ore");
		

		SO.blockIndexInTexture = ModLoader.addOverride("/terrain.png",
				"/SapphireOre.png");
		RB.blockIndexInTexture = ModLoader.addOverride("/terrain.png",
				"/RedstoneBlock.png");
		RO.blockIndexInTexture = ModLoader.addOverride("/terrain.png",
				"/RubyOre.png");
		ZO.blockIndexInTexture = ModLoader.addOverride("/terrain.png",
				"/ZirconOre.png");
		

	}

}