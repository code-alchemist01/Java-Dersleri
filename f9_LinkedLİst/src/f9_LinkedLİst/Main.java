package f9_LinkedLİst;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		for(String i : arrayList) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		
		arrayList.add(2, "En Büyük Kutay");
		
		for(String i : arrayList) {
			System.out.println(i);
		}


	}

}
