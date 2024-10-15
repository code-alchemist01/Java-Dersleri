package d3_EbobBulma;

import java.util.Scanner;

public class Main {
	
	
	public static int ebobBulma(int s1,int s2) {
		int ebob = 1;
		for(int i = 1; i <= s1 && i <= s2; i++) {
			if((s1 % i == 0) && (s2 % i == 0)) {
				ebob = i;
			}
			
		}
		return ebob;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ebobu hesaplanacak ilk sayıyı girin: ");
		int sayi1 = scanner.nextInt();
		System.out.print("Ebobu hesaplanacak ikinci sayıyı girin: ");
		int sayi2 = scanner.nextInt();
		
		System.out.println("Bu iki sayının EBOBU " + ebobBulma(sayi1, sayi2));

	}

}
