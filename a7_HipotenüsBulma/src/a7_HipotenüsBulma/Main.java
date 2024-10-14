package a7_HipotenüsBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int k1,k2;
		double h;
		
		System.out.print("İlk kenarı girin: ");
		k1 = scanner.nextInt();
		System.out.print("İkinci kenarı girin: ");
		k2 = scanner.nextInt();
		
		
		h =  Math.sqrt((k1 * k1) + (k2 * k2)); 
		System.out.println(h);

	}

}
