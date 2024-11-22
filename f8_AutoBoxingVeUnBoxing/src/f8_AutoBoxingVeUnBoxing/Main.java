package f8_AutoBoxingVeUnBoxing;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		// ArrayList<int> arrayList2 = new ArrayList<int>(); // İlkel veri tipi olduğu
		// için bu şekilde yazılamaz

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(); // Doğru yazımı bu şekilde

		/*
		 * boolean ---> Boolean char ---> Character byte ---> Byte short ---> Short int
		 * ---> Integer long ---> Long float ---> Float double ---> Doubles
		 * 
		 */

		for (int i = 0; i < 10; i++) {
			arrayList2.add(Integer.valueOf(i * 11)); // AutoBoxing  --> Kutuya koy
		}

		for (int i = 0; i < arrayList2.size(); i++) {

			System.out.println(arrayList2.get(i).intValue()); // Unboxing ---> Kutudan Çıkar xD

		}

	}

}
