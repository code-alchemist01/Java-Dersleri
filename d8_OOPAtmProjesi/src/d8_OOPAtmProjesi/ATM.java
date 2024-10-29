package d8_OOPAtmProjesi;

import java.util.Scanner;

public class ATM {
	
	public void calis(Hesap hesap) {
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankamıza Hoşgeldiniz");
		System.out.println("**********************");
		System.out.println("Kullanıcı Girişi");
		System.out.println("**********************");
		
		int giris_hakki = 3;
		
		while(true) {
			if(login.login(hesap)) {
				System.out.println("Giriş Başarılı");
				break;
			}
			else {
				System.out.println("Giriş başarısız..");
				giris_hakki--;
				System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
			}
			if(giris_hakki == 0) {
				System.out.println("Giriş Hakkınız Bitti Programdan Çıkılıyor..");
				return;
			}
		}
		
		
		System.out.println("************************");
		
		String islemler = "1. Bakiye Görüntüle\n"
						+ "2. Para Yatırma\n"
						+ "3. Para Çekme\n"
						+ "Çıkış için q ya basın";
		System.out.println(islemler);
		System.out.println("************************");
		
		
		while (true) {
			System.out.print("İşlemi seçiniz: ");
			String islem = scanner.nextLine();
			
			
			switch(islem) {
			case "1":
				System.out.println("Güncel Bakiyeniz : " + hesap.getBakiye() + " tl dir");
				break;
			case "2":
				System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
				double y_tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(y_tutar);
				break;
			case "3":
				System.out.print("Çekmek istediğiniz tutarı giriniz: ");
				double c_tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(c_tutar);
				break;
			case "q":
				System.out.println("Programdan Çıkılıyor...");
				return;
			}
			
			
			
		}
		
	
		
	}

}
