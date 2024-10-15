package c6_FaizUygulamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Kullanıcının anaparasının kaç yıl vadede kalacağını girin ve her yıl toplam parayı ekrana yazın faiz %10 */
		
		
		Scanner scanner = new Scanner(System.in);
		double anapara = 100000;
		System.out.print("Kaç yıl vade istediğinizi giriniz : ");
		int vade = scanner.nextInt();
		
		for(int i = 1; i <= vade; i++ ) {
			anapara = (anapara + (anapara * 0.01));
			System.out.println(i + ". yılın toplam parası " + anapara);
		}
		
		
		

	}

}
