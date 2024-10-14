package b1_IfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*

			if(koşul) {
				Koşul doğru ise burdaki kod bloğu çalışır 
					}
			else if(koşul){
			 	Birinci koşul yanlış ama ikinci koşul doğru ise bu kod bloğu çalışır
			 		}
					
			else {
				if-else sistemindeki bütün koşullar yanlışsa bu kod bloğu çalışır
					}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen elinizdeki mermi sayısını girin: ");
		int mermi = scanner.nextInt();
		
		if(mermi < 10 ) {
			System.out.println("Henüz er olduğunuz için " + mermi + " merminiz mevcut");
		}
		else if(mermi > 10 && mermi < 30) {
			System.out.println("Komando olduğunuz için " + mermi + " merminiz mevcut");
			
		}
		else if(mermi > 30 && mermi < 100) {
			System.out.println("SAT olduğunuz için " + mermi + " merminiz mevcut");
			
		}
		else {
			System.out.println("Bordo Bereli olduğunuz için " + mermi + " merminiz mevcut");

		}
		
		
		
	}

}
