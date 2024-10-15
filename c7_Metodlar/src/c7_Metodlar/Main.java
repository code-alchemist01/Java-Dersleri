package c7_Metodlar;

import java.util.Scanner;

public class Main {

	public static void hello() {
		System.out.println("Merhabalar Efendim");
		System.out.println("Nasılsınız");
	}
	
	public static void faktoriyel() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hangi Sayının Faktoriyelini hesaplayacaksınız: ");
		int sayi = scanner.nextInt();
		
		int faktoriyel = 1;
		
		for(int i = sayi;i > 1;i--) {
			faktoriyel *= i;
		}
		
		System.out.println(faktoriyel);
		
		
	}
	
	
	public static void main(String[] args) {
		
		hello();
		faktoriyel();

	}

}
