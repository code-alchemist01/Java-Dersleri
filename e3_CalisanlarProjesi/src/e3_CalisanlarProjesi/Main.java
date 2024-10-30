package e3_CalisanlarProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Çalışanlar programına hoşgeldiniz..");
		System.out.println("**************************************");
		String islemler = "İşlemler...\n" + "1. Yazılımcı İşlemleri\n" + "2. Yönetici İşlemleri\n"
				+ "Çıkış için q ya basın";
		System.out.println(islemler);
		System.out.println("*****************************");

		while (true) {
			System.out.print("İşlemi seçiniz: ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programndan Çıkılıyor...");
				break;
			} 
			
			
			else if (islem.equals("1")) {
				Yazilimci yazılımcı1 = new Yazilimci("Kutay", "Şahin", 123, "C,CPP,Python");
				String yazılımcı_islem = "1. Format At\n" + "2. Bilgileri Göster\n" + "Çıkış için q ya bas";
				System.out.println(yazılımcı_islem);
				while (true) {
					System.out.print("Yazılımcı işlemini seçin: ");
					String y_islem = scanner.nextLine();

					if(y_islem.equals("q")) {
						System.out.println("Yazılımcı  işlemlerinden çıkış yapılıyor...");
						break;
					}
					else if(y_islem.equals("1")) {
						System.out.print("Formatlamak istediğiniz işletim sistemini girin: ");
						String isletim_sist = scanner.nextLine();
						yazılımcı1.formatAt(isletim_sist);
					}
					else if(y_islem.equals("2")) {
						yazılımcı1.bilgileriGoster();
					}
					else {
						System.out.println("Geçersiz Yazılımcı İşlemi");
					}
				}

			}

			
			else if (islem.equals("2")) {
				Yonetici yonetici1 = new Yonetici("Aslı", "Şahin", 456, 8);
				String yonetici_islem = "1. Zam Yap\n" + "2. Bilgileri Göster\n" + "Çıkış için q ya bas";
				System.out.println(yonetici_islem);
				while (true) {
					System.out.print("Yönetici işlemini seçin: ");
					String yo_islem = scanner.nextLine();

					if(yo_islem.equals("q")) {
						System.out.println("Yazılımcı  işlemlerinden çıkış yapılıyor...");
						break;
					}
					else if(yo_islem.equals("1")) {
						System.out.print("Yapmak İstediğiniz zam miktarını girin : ");
						int zam_miktari = scanner.nextInt();
						scanner.nextLine();
						yonetici1.zam_yap(zam_miktari);
					}
					else if(yo_islem.equals("2")) {
						yonetici1.bilgileriGoster();
					}
					else {
						System.out.println("Geçersiz Yönetici İşlemi");
					}
				}
			} else {
				System.out.println("Geçersiz işlem");
			}

		}

	}

}
