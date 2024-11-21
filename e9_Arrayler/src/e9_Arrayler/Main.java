package e9_Arrayler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		int[] a = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i < 5; i++) {
			System.out.println(i + ". elemanı girin: ");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("********************************");
		
		
		for(int i =0; i < 5; i++) {
			System.out.println(i + ". eleman: " + a[i]);
		}
		
		System.out.println("Dizimizin uzunluğu: " + a.length);
		 
		
		
		
		
		
		
		
		
		
		
//		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
////		System.out.println(a[2]);
////		System.out.println(a[3]);
//
//		for (int i = 0; i < a.length; i++) {
//
//			a[i] = i * 12 + 115;
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//
//			System.out.println(a[i]);
//		}

		// int[] a = 5;

//		int[] a = new int[20];
//		a[12] = 222;
//		System.out.println(a[12]);
//		

	}

}
