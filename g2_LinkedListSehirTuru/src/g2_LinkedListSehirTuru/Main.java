package g2_LinkedListSehirTuru;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void islemleri_bastir() {

		System.out.println("0 - İşlemleri Görüntüle..");
		System.out.println("1 - Bir sonraki şehre git...");
		System.out.println("2 - Bir önceki şehre git...");
		System.out.println("3 - Uygulamadan Çık.");

	}

	public static void sehirleri_turla(LinkedList<String> sehirler) {
		ListIterator<String> iterator = sehirler.listIterator();

		int islem;

		islemleri_bastir();

		Scanner scanner = new Scanner(System.in);

		if (!iterator.hasNext()) {

			System.out.println("Herhangi bir şehir bulunmuyor...");
		}
		boolean cikis = false;
		boolean ileri = true;

		while (!cikis) {
			System.out.println("Bir işlem seçiniz:");

			islem = scanner.nextInt();

			switch (islem) {
			case 0:
				islemleri_bastir();
				break;
			case 1:
				if (!ileri) {
					if (iterator.hasNext()) {

						iterator.next();

					}
					ileri = true;

				}
				if (iterator.hasNext()) {

					System.out.println("Şehre gidiliyor : " + iterator.next());

				} else {
					System.out.println("Gidilecek Şehir Kalmadı...");
					ileri = true;

				}
				break;
			case 2:
				if (ileri) {
					if (iterator.hasPrevious()) {
						iterator.previous();

					}
					ileri = false;

				}
				if (iterator.hasPrevious()) {

					System.out.println("Şehre Gidiliyor : " + iterator.previous());

				} else {
					System.out.println("Şehir Turu Başladı....");
				}
				break;

			case 3:
				cikis = true;
				System.out.println("Uygulamadan çıkılıyor...");
				break;

			}

		}

	}

	public static void main(String[] args) {

		LinkedList<String> sehirler = new LinkedList<String>();

		sehirler.add("Ankara");
		sehirler.add("Eskişehir");
		sehirler.add("Afyon");

		sehirleri_turla(sehirler);

	}

}
