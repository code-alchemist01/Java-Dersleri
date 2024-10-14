package a6_IkıSayininDegeriniDegistirmeProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s1,s2,temp;
		
		System.out.print("İlk sayıyı girin: ");
		s1 = scanner.nextInt();
		System.out.print("İkinci sayıyı girin: ");
		s2 = scanner.nextInt();
		
		System.out.println("Değiştirilmeden Önce Birinci sayımız: " + s1);
		System.out.println("Değiştirilmeden Önce İkinci sayımız: " + s2);

		
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println("Değiştirildikten Sonra Birinci sayımız: " + s1);
		System.out.println("Değiştirildikten Sonra İkinci sayımız: " + s2);
		
		

	}

}
