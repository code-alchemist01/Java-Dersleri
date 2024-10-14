package a4_BedenKitleIndexiProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
		int kilo = scanner.nextInt();
		
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
		double boy = scanner.nextDouble();
		
		double bki = kilo / (boy * boy);
		System.out.println("Beden Kitle İnedksi: " + bki);
	}

}
