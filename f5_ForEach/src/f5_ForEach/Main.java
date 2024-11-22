package f5_ForEach;

public class Main {

	public static void main(String[] args) {
		String[] array = {"Kutay","Aslı","Şahin"};
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		for (String a : array) { // forEach
			System.out.println(a);
		}
		
		
	}

}
