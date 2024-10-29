package d9_OOPIdmanProgramiProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("İdman Programına Hoşgeldiniz..");
		System.out.println("********************************");
		String idmanlar = "Geçerli Hareketler...\n" + "1-->Burpee\n" + "2-->Pushup\n" + "3-->Situp\n" + "4-->Squat";
		System.out.println(idmanlar);
		System.out.println("********************************");
		System.out.println("Bir idman oluşturun");
		System.out.println("********************************");

		System.out.print("Burpee Sayısı: ");
		int burpeeSayisi = scanner.nextInt();

		System.out.print("Pushup Sayısı: ");
		int pushupSayisi = scanner.nextInt();

		System.out.print("Situp Sayısı: ");
		int situpSayisi = scanner.nextInt();

		System.out.print("Squat Sayısı: ");
		int squatSayisi = scanner.nextInt();
		scanner.nextLine();

		Idman idman = new Idman(burpeeSayisi, pushupSayisi, situpSayisi, squatSayisi);
		idman.idmanProgramıGoster();
		System.out.println("********************************");

		System.out.println("İdmanınız başlıyor");
		
		while(idman.idmanBittiMi() == false) {
			System.out.print("İdman Türü(Burpee,Pushup,Situp,Squat): ");
			String tur = scanner.nextLine();
			System.out.print("Hareketi kaç kere yapacaksınız? : ");
			int adet = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, adet);
		}
		System.out.println("İdman Programını Bitirdiniz Tebrikler...");
		
	}

}
