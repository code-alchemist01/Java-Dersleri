package c4_CarpimTablosu;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// iç içe for kullanarak çarpım tablosu yazılacak

		Scanner scanner = new Scanner(System.in);
		System.out.print("Çarpım Tablosunun Satır sayısı: ");
		int satir = scanner.nextInt();
		System.out.print("Çarpım tablosunun sütun sayısı: ");
		int sutun = scanner.nextInt();
		
		
		for(int i = 1;i <= satir;i++) {	
			System.out.println("**************************");
			for(int j = 1; j <= sutun; j++) {
				System.out.println(i + " x " + j + " = " + (i *j));
				
			}
			System.out.println("**************************");
		}
		
		
	}

}
