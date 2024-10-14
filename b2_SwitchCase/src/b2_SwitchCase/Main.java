package b2_SwitchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*

			switch(ifade) {
				case state1:
					islemler
					break;
				case state2:
					islemler
					break;
				default:
					islemler
					break;

		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen 1-7 arasında bir sayı girin: ");
		int gün = scanner.nextInt();
		
		switch (gün) {
		case 1:
			System.out.println("Bugün günlerden Pazartesi");
			break;
		case 2:
			System.out.println("Bugün günlerden Salı");
			break;
		case 3:
			System.out.println("Bugün günlerden Çarşamba");
			break;
		case 4:
			System.out.println("Bugün günlerden Perşembe");
			break;
		case 5:
			System.out.println("Bugün günlerden Cuma");
			break;
		case 6:
			System.out.println("Bugün günlerden Cumartesi");
			break;
		case 7:
			System.out.println("Bugün günlerden Pazar");
			break;
		default:
			System.out.println("Geçersiz değer girdin salak");
			break;
		}
			
		
		
		
	}

}
