
package e8_BeybladeProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Beyblade Programına Hoşgeldiniz....\n"
						+ "Çıkış için q ya basınız...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***************************");
		
		while(true) {
			System.out.print("Hangi beyblade'i üretmek istersiniz("
							+ "Dragon"
							+ ",Dranza"
							+ ",Draciel"
							+ ",Drayga) :" );
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan çıkılıyor...");
				break;
			}
			else {
				beybladeFabrikası fabrika = new beybladeFabrikası();
				Beyblade beyblade = fabrika.beybladeUret(islem);
				
				if(beyblade == null) {
					System.out.println("Girdiğiniz beyblade henüz fabrikada mevcut değil. İleri bir tarihte tekrar deneyin...");
				}
				else {
					beyblade.bilgileriGoster();
					beyblade.saldır();
					beyblade.kutsalCanavarOrtayaCikar();
				}
				
				
				
			}
			
		}
		
		
	}

}
