package d4_MethodOverloadingHesapMakinesi;

import java.util.Scanner;

public class Main {

	
	public static int toplama(int s1,int s2,int s3) {
		return s1 + s2 + s3;
	}
	public static int toplama(int s1,int s2) {
		return s1 + s2;
	}
	public static int çıkarma(int s1,int s2,int s3) {
		return s1 - s2 - s3;
	}
	public static int çıkarma(int s1,int s2) {
		return s1 - s2 ;
	}
	public static int çarpma(int s1,int s2,int s3) {
		return s1 * s2 * s3;
	}
	public static int çarpma(int s1,int s2) {
		return s1 * s2 ;
	}
	public static double bölme(double s1,double s2,double s3) {
		return s1 / s2 / s3;
	}
	public static double bölme(double s1,double s2) {
		return s1 / s2 ;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Gelişmiş Hesap Makinesi Sistemine Hoşgeldiniz \n"
						+ "Yapabileceğiniz işlemler\n"
						+ "1-->  Toplama işlemi\n"					
						+ "2-->  Çıkarma işlemi\n"
						+ "3-->  Çarpma işlemi\n"
						+ "4-->  Bölme işlemi\n"
						+ "q--> Çıkış işlemi");
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
			String secim = scanner.nextLine();
			
			if(secim.equals("q")) {
				System.out.println("Sistemden Çıkış Yapılıyor...");
				break;
			}
			
			else if(secim.equals("1")) {
				System.out.print("Toplama işlemini seçtiniz 2 sayıyla mı 3 sayıyla mı işlem yapmak istersiniz? :");
				int hangisi = scanner.nextInt();
				if(hangisi == 2) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin: ");
					int s2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("İki sayının toplamı : " + toplama(s1, s2));
					
				}
				else if (hangisi == 3) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin : ");
					int s2 = scanner.nextInt();
					System.out.println("Üçüncü sayıyı girin : ");
					int s3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Üç sayının toplamı : " + toplama(s1, s2,s3));
				}
				else {
					System.out.println("Sadece 2 ve 3 sayı için işlem kapasitem mevcut tekrar girin...");
				
				}
				
				
			}
			
			else if(secim.equals("2")) {
				System.out.print("Çıkarma işlemini seçtiniz 2 sayıyla mı 3 sayıyla mı işlem yapmak istersiniz? :");
				int hangisi = scanner.nextInt();
				if(hangisi == 2) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin: ");
					int s2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("İki sayının farkı : " + çıkarma(s1, s2));
					
				}
				else if (hangisi == 3) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin : ");
					int s2 = scanner.nextInt();
					System.out.println("Üçüncü sayıyı girin : ");
					int s3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Üç sayının farkı : " + çıkarma(s1, s2,s3));
				}
				else {
					System.out.println("Sadece 2 ve 3 sayı için işlem kapasitem mevcut tekrar girin...");
				
				}
				
				
			}
			
			else if(secim.equals("3")) {
				System.out.print("Çarpma işlemini seçtiniz 2 sayıyla mı 3 sayıyla mı işlem yapmak istersiniz? :");
				int hangisi = scanner.nextInt();
				if(hangisi == 2) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin: ");
					int s2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("İki sayının çarpımı : " + çarpma(s1, s2));
					
				}
				else if (hangisi == 3) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin : ");
					int s2 = scanner.nextInt();
					System.out.println("Üçüncü sayıyı girin : ");
					int s3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Üç sayının çarpımı : " + çarpma(s1, s2,s3));
				}
				else {
					System.out.println("Sadece 2 ve 3 sayı için işlem kapasitem mevcut tekrar girin...");
				
				}
				
				
			}
			
			
			else if(secim.equals("4")) {
				System.out.print("Bölme işlemini seçtiniz 2 sayıyla mı 3 sayıyla mı işlem yapmak istersiniz? :");
				int hangisi = scanner.nextInt();
				if(hangisi == 2) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin: ");
					int s2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("İki sayının bölümü : " + bölme(s1, s2));
					
				}
				else if (hangisi == 3) {
					System.out.print("Birinci sayıyı girin : ");
					int s1 = scanner.nextInt();
					System.out.print("İkinci sayıyı girin : ");
					int s2 = scanner.nextInt();
					System.out.println("Üçüncü sayıyı girin : ");
					int s3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Üç sayının bölümü : " + bölme(s1, s2,s3));
				}
				else {
					System.out.println("Sadece 2 ve 3 sayı için işlem kapasitem mevcut tekrar girin...");
				
				}
				
				
			}
			
			
		}
		

	}

}
