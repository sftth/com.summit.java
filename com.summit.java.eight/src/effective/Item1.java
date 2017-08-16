package effective;

import java.math.BigInteger;
import java.util.Random;

public class Item1 {
	public static void main(String[] args) {
		int bitLength = 3;
		Random rnd = new Random();
		
		BigInteger bigVal = BigInteger.probablePrime(bitLength, rnd);
		
		System.out.println(bigVal.toString()+":"+bigVal.toString().length());
	}
}
