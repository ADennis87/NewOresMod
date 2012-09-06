package net.minecraft.src;

import java.util.Random;

public class BlockBrokenHeartOre extends Block
{
	
	
	protected BlockBrokenHeartOre(int i, int j)
	{
		super(i,j,Material.rock);
	}
	public int idDropped(int i, Random random)
	{
		return mod_newOres.BrokenHeart.shiftedIndex;
	}
	public int quantityDropped(Random random) {
		return 1;
	}
	public void generateSurface(World world, Random rand, int y, int z) {
		for (int a = 0; a < 2; a++) {
			int i = y + rand.nextInt(16);
			int j = rand.nextInt(20);
			int k = z + rand.nextInt(16);
			(new WorldGenMinable(mod_newOres2.BHO.blockID, 15)).generate(world,
					rand, i, j, k);}
	}
	public void mod_BlockBrokenHeartOre()
	{
		ModLoader.registerBlock(mod_newOres2.BHO);
		ModLoader.addName(mod_newOres2.BHO, "Broken Heart Ore");
		mod_newOres2.BHO.blockIndexInTexture = ModLoader.addOverride("/terrain.png",
				"/BrokenHeartOre.png");
						
			
			
			}

}
