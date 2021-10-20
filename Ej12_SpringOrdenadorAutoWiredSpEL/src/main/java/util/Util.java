package util;

public class Util {
	
	public static double generateRandomNumber(int min, int max) {
		return (Math.random() * ((max - min) + 1)) + min;
	}
	
	public static String generateRandomBrands()	{
		String randomBrands[] = {"Nvidia","Asus","Gigabyte","Zotac","Acer","Palit","XFX"};
		String rBrand = randomBrands[(int)(generateRandomNumber(0, randomBrands.length-1))];
		
		return rBrand;
	}

}
