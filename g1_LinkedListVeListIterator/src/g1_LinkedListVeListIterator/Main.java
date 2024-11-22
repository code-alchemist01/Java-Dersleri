package g1_LinkedListVeListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
		/*
		 * for(String s : gidilecekYerler) { System.out.println(s); }
		 */

		ListIterator<String> iterator = gidilecekYerler.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
	
	public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni) {
		ListIterator<String> iterator = gidilecekYerler.listIterator();
		
		while (iterator.hasNext()) {
			int karsilastir = iterator.next().compareTo(yeni);
			
			if(karsilastir == 0) { // iki değer eşit
				System.out.println("Listede bu eleman zaten var");
				return;
			}
			else if(karsilastir < 0) { // yeni  değer iterator.nextten büyük
				
			}
			else if(karsilastir > 0) { // yeni  değer iterator.nextten küçük	
				iterator.previous(); // bir geri al
				iterator.add(yeni); // geri alınana ekle
				return;
			}
		}
		iterator.add(yeni);
		

	}

	public static void main(String[] args) {

		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		LinkedList<String> gidilecekYerler2 = new LinkedList<String>();


		gidilecekYerler.add("Ev");
		gidilecekYerler.add("Hastane");
		gidilecekYerler.add("Pastane");
		gidilecekYerler.add("Okul");
		gidilecekYerler.add("Kütüphane");

		listeyiBastir(gidilecekYerler);
		
		System.out.println("---------------------------");
		
		gidilecekYerler.add(2,"Cami");
		listeyiBastir(gidilecekYerler);
		
		System.out.println("---------------------------");
		
		gidilecekYerler.remove(3);
		listeyiBastir(gidilecekYerler);
		
		System.out.println("---------------------------");


		siraliEkle(gidilecekYerler2, "Ev");
		siraliEkle(gidilecekYerler2, "Okul");
		siraliEkle(gidilecekYerler2, "Lab");
		
		listeyiBastir(gidilecekYerler2);
	}

}
