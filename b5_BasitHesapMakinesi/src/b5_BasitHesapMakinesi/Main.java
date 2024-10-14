package b5_BasitHesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int s1,s2,islem;
		
		System.out.println("Yapmak istediğiniz işlemi 1-4 arasında belirtin "
						+ "(1->Toplama"
						+ " 2-> Çıkarma"
						+ " 3-> Çarpma"
						+ " 4-> Bölme)");
		
		islem = scanner.nextInt();
		
		switch(islem) {
		
		case 1:
			System.out.println("Birinci sayıyı girin");
			s1 = scanner.nextInt();
			System.out.println("İkinci sayıyı girin");
			s2 = scanner.nextInt();
			
			System.out.println("Toplama İşleminin Sonucu " + (s1 + s2));
			break;
		case 2:
			System.out.println("Birinci sayıyı girin");
			s1 = scanner.nextInt();
			System.out.println("İkinci sayıyı girin");
			s2 = scanner.nextInt();
			
			System.out.println("Çıkarma İşleminin Sonucu " + (s1 - s2));
			break;
		case 3:
			System.out.println("Birinci sayıyı girin");
			s1 = scanner.nextInt();
			System.out.println("İkinci sayıyı girin");
			s2 = scanner.nextInt();
			
			System.out.println("Çarpma İşleminin Sonucu " + (s1 * s2));
			break;
		case 4:
			System.out.println("Birinci sayıyı girin");
			s1 = scanner.nextInt();
			System.out.println("İkinci sayıyı girin");
			s2 = scanner.nextInt();
			
			System.out.println("Bölme İşleminin Sonucu " + ((double)s1 / (double)s2));
			break;
		default:
			System.out.println("Hatalı İşlem Seçimi");
		
		
		
		
		
		}
	
		
		
		
		
		
		
		
		

	}

}
