package c2_AtmProgramı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Yapılacak İşlemler : 1-->Bakiye Öğrenme, 2-->Para Çekme, 3-->Para Yatırma, Çıkış : q
		
		Scanner scanner = new Scanner(System.in);
		String islem;
		int bakiye = 5000;
		
		
		
		
		
		while(true) {
			
			System.out.println("Yapmak istediğiniz işlemi seçiniz (1-->Bakiye Öğrenme, 2-->Para Çekme, 3-->Para Yatırma, Çıkış : q)");
			islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Sistemden Çıkış Yapılıyor....");		
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Güncel Bakiyeniz : " + bakiye);
			}
			else if(islem.equals("2")) {
				System.out.print("Çekilecek tutarı giriniz: ");
				int çpara = scanner.nextInt();
				scanner.nextLine();
				
				if( bakiye - çpara < 0) {
					System.out.println("Para Çekilemez Yeterli Para yok... Bakiyeniz: " + bakiye );
				}
				else {
					bakiye -= çpara;
					
				}
			}
			else if(islem.equals("3")) {
				System.out.print("Yatırmak istediğiniz tutarı seçin: ");
				int ypara = scanner.nextInt();
				scanner.nextLine();
				bakiye += ypara;
			}
		
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
