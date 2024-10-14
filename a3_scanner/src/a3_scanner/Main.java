package a3_scanner;

import java.util.Scanner; // scanner objesini kullanabilmek için scanner kütüphanesini eklemek gerekiyor

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner sınıfından scanner objesi oluşturup sisteme dahil ediyoruz
		
		System.out.println("Lütfen isminizi giriniz : ");
		String isim = scanner.nextLine();
		
		System.out.println("Lütfen kilonuzu giriniz: ");
		int kilo = scanner.nextInt(); // almak istediğiniz veri tipine göre scanner.next ibaresinden sonra seçim yapabilirsiniz
		
		System.out.println("Boyunuzu giriniz: ");
		int boy = scanner.nextInt();
		
		
		
		System.out.println("Selam " + isim + " " + boy + " boyunda " + kilo + " kilogram ayı gibi adamsın");
		
		
		
	}

}
