package es.teralco.academy.challenges.ii;

import java.util.List;
import java.math.BigInteger;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PabloNumbers p = new PabloNumbers();
		long start = System.nanoTime();
		List<BigInteger> cadenas = p.getNumbers(5);
		long time = System.nanoTime() - start;
		Main.printArray(cadenas);
		System.out.printf("%nTardó %.3f segundos", time / 1e9);
	}

	public static void printArray(List<BigInteger> cadenas){
		for (BigInteger num : cadenas) {
			System.out.print(num +  ", ");	
		}
	}
	
}
