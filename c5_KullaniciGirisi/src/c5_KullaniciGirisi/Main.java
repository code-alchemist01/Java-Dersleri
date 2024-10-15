package c5_KullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int giris_hakki = 3;
		
		String kayitli_ad = "kutay";
		String kayitli_parola = "1234";
		
		
		while(true) {
			
			
			System.out.print("Kullanıcı adını giriniz : ");
			String kadi = scanner.nextLine();
			System.out.print("Şifreyi giriniz : ");
			String sifre = scanner.nextLine();
			
			
			
			
			
			 if (kayitli_ad.equals(kadi) && kayitli_parola.equals(sifre) ) {
				System.out.println("Sisteme Hoşgeldin " + kayitli_ad);
				break;
			}
			else if (kayitli_ad.equals(kadi) && !(kayitli_parola.equals(sifre)) ) {
				System.out.println("Şifreniz yanlış tekrar deneyin.");
				giris_hakki--;
				System.out.println("Kalan giriş hakkı : " + giris_hakki);
				
			}
			else if (!(kayitli_ad.equals(kadi)) && kayitli_parola.equals(sifre) ) {
				System.out.println("Kullanıcı adı yanlış tekrar deneyin.");
				giris_hakki--;
				System.out.println("Kalan giriş hakkı : " + giris_hakki);
				
			}
			else {
				System.out.println("Hem kullanıcı adı hem şifre yanlış tekrar deneyin.");
				giris_hakki--;
				System.out.println("Kalan giriş hakkı : " + giris_hakki);
			}
			
			if(giris_hakki < 1) {
				System.out.println("Tüm haklarınız bitti sistemden çıkılıyor..");
				break;}
		}
			
		
		
		
		
		
		
		
		
		
	}

}
