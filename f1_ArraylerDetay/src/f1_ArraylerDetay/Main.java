package f1_ArraylerDetay;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int[] arrayi_doldur(int sayi) {
		Scanner scanner = new Scanner(System.in);
		int[] cikti = new int[sayi];

		for (int i = 0; i < sayi; i++) {
			System.out.println((i+1) + ". elemanı girin: " );
			cikti[i] = scanner.nextInt();
		}
		return cikti;

	}

	public static void arrayi_bastir(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + (i + 1) + " : " + array[i]);
		}
	}
	
	public static void array_sort(int[] array) {
		Arrays.sort(array); // Arrays sınıfına ait sıralama özelliği
		arrayi_bastir(array);
	}

	public static void main(String[] args) {
		
		int[] a = arrayi_doldur(5);
		System.out.println("Sıralanmamış Dizi");
		System.out.println("------------------------------");
		arrayi_bastir(a);
		System.out.println("------------------------------");
		System.out.println("Sıralanmış Dİzi");
		System.out.println("------------------------------");
		array_sort(a);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		int[] a1 = {1,2,3,4};
		int[] a2 = {1,2,3,4};
		
		
		if(a1 == a2) {
			System.out.println("Eşitler");
		}
		else {
			System.out.println("Eşit Değiller");  // Elemeanları aynı olsada tutuldukları adreslerdeki farklı olduğundan eşit değillerdir
		}
		
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("Eşitler");
		}
		else {
			System.out.println("Eşit Değiller");  // equals ise dizilerin eşit olup olmadığını kontrol etmemizi sağlar. O yüzden eşittir
		}
		

	}

}
