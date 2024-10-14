package b3_ucSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen Birinci Sayıyı girin: ");
		int s1 = scanner.nextInt();
		System.out.print("Lütfen İkinci Sayıyı girin: ");
		int s2 = scanner.nextInt();
		System.out.print("Lütfen Üçüncü Sayıyı girin: ");
		int s3 = scanner.nextInt();
		
		if(s1 > s2 && s1 > s3) {
			System.out.println(s1 + " bu üç sayıdan en büyüğü!");
		}
		else if(s2 > s1 && s2 > s3) {
			System.out.println(s2 + " bu üç sayıdan en büyüğü!");
		}
		else if(s3 > s1 && s3 > s2) {
			System.out.println(s3 + " bu üç sayıdan en büyüğü!");
		}
		else {
			System.out.println("Sayılarda eşitlik var");
		}

	}

}

	
