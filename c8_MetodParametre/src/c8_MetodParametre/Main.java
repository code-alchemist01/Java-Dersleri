package c8_MetodParametre;

import java.util.Scanner;

public class Main {

	public static void hello(String isim) {
		System.out.println("Selam " + isim);
	}
	
	public static void çarpma(int s1,int s2) {
		System.out.println(s1 + " x " + s2 + " = " + s1 *s2);
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("İsminizi girin: ");
		String ad = scanner.nextLine();
		hello(ad);
		
		System.out.print("Lütfen birinci sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.print("Lütfen ikinci sayıyı giriniz: ");
		int sayi2 =scanner.nextInt();
		çarpma(sayi1,sayi2);
	}

}
