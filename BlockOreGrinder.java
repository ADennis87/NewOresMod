package net.minecraft.src;
import java.util.Random;

public class BlockOreGrinder extends Block
{
	protected BlockOreGrinder(int i, int j) {
		super(i,j,Material.rock);
	}

	public static final Block OG = (new Block(170, Material.rock)).setHardness(2.0F).setResistance(10F).setBlockName("OG");
	
	
}
