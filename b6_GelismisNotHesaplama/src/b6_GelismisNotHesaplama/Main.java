package b6_GelismisNotHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Vize Notunu Giriniz: ");
		int vize = scanner.nextInt();
		System.out.print("Final Notunu Giriniz: ");
		int fnl = scanner.nextInt();
		
		
		double ortalama = (vize * 0.4) + (fnl * 0.6);
		
		
		if(ortalama > 90) {
			System.out.println("Ortalamanız " + ortalama + " AA Harf notunu aldınız");
		}
		else if(ortalama < 90 && ortalama > 80) {
			System.out.println("Ortalamanız " + ortalama + " BA Harf notunu aldınız");
		}
		else if(ortalama < 80 && ortalama > 70) {
			System.out.println("Ortalamanız " + ortalama + " BB Harf notunu aldınız");
		}
		else if(ortalama < 70 && ortalama > 60) {
			System.out.println("Ortalamanız " + ortalama + " CC Harf notunu aldınız");
		}
		else if(ortalama < 60 && ortalama > 50) {
			System.out.println("Ortalamanız " + ortalama + " DD Harf notunu aldınız");
		}
		else {
			System.out.println("Ortalamanız " + ortalama + " FF Harf notunu aldınız ders tekrarı gerekli");
		}
		
		
		
		
		
		
		
		
		

	}

}
