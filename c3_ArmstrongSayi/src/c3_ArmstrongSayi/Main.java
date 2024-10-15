package c3_ArmstrongSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Girilen Sayının armstrong olması
		 * 1634 = 1^4 + 6^4 + 3^4 + 4^4 ( 4 basamak sayısı)
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayıyı giriniz: ");
		int sayi = scanner.nextInt();
		System.out.println("Basamak Sayısını giriniz: ");
		int basamak = scanner.nextInt();
		int gecici = sayi;
		int toplam = 0;
		
		do {
			int basamak_degeri = gecici % 10;
			gecici = gecici / 10;
			toplam += Math.pow(basamak_degeri, basamak);
			
			
		}while(gecici > 0);
		
		if(sayi == toplam) {
		  System.out.println("Armstrong Sayıdır");
		}
		else {
			System.out.println("Armstrong Sayı Değildir");
		}
		
		
	}

}
