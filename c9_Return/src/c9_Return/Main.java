package c9_Return;

import java.util.Scanner;

public class Main {
	
	
	public static int toplama(int s1,int s2) {
		return s1 + s2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int sayi2 = scanner.nextInt();
		
		System.out.println(toplama(sayi1,sayi2));
		

	}

}
