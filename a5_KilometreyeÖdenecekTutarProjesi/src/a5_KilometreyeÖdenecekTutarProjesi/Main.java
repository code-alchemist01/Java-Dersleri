package a5_KilometreyeÖdenecekTutarProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen gidilecek mesafeyi kilometre cinsinden giriniz: ");
		double km = scanner.nextDouble();
		
		System.out.print("Kilometre başına yakılan benzin fiyatını girin: ");
		double tl = scanner.nextDouble();
		
		double tutar = km * tl;
		System.out.println(km + " kilometre mesafede " + tutar + " tl ödeme yapacaksınız.");
	}

}
