package b4_KosulluKitle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu metre cinsinden girin: ");
		double boy = scanner.nextDouble();
		System.out.println("Lütfen kilonuzu kilogram cinsinden girin. ");
		int kg = scanner.nextInt();
		
		double bki = kg / (boy * boy);
		
		if(bki <= 18.5) {
			System.out.println("Beden kitle indeksiniz " + bki + " çok zayıfsınız");
		}
		else if(bki > 18.5 && bki < 24.9) {
			System.out.println("Beden kitle indeksiniz " + bki + " skalada normal kilodasınız");
		}
		else if(bki > 25 && bki < 29.9) {
			System.out.println("Beden kitle indeksiniz " + bki + " skalaya göre kilonuz çok fazla");
		}
		else if(bki > 30 && bki < 34.9) {
			System.out.println("Beden kitle indeksiniz " + bki + " skalaya göre 1. derece obezsiniz!");
		}
		else {
			System.out.println("Beden kitle indeksiniz " + bki + " skalaya göre 2. derece ve üstü obezsiniz");
		}

	}

}
