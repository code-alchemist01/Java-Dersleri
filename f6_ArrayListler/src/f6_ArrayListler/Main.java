package f6_ArrayListler;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Kutay");
		arrayList.add("Aslı");
		arrayList.add("Şahin");
		arrayList.add("Elma");

//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.size());

		for (String i : arrayList) {
			System.out.println(i);
		}

		arrayList.remove(1);
		arrayList.remove("Kutay");
		System.out.println("----------------");

		for (String i : arrayList) {
			System.out.println(i);
		}

		System.out.println("----------------");

		arrayList.add("Armut");
		System.out.println(arrayList.indexOf("Elma")); // ilk indekse göre tarama
		System.out.println(arrayList.lastIndexOf("Armut")); // son indekse göre tarama
		
		System.out.println("----------------");

		arrayList.set(2, "Kutay");
		
		System.out.println(arrayList.get(2));
		
		
	}

}
