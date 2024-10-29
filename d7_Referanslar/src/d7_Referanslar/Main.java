package d7_Referanslar;

public class Main {

	public static void main(String[] args) {

		Account ac1 = new Account("Kutay", "a@gmail.com", "06888");
		Account ac2 = ac1;
		Account ac3 = new Account();
		
		if(ac1 == ac2) {
			System.out.println("Aynı objeyi gösteriyor...");
		}
		
		if(ac1 == ac3) {
			System.out.println("Aynı objeyi gösteriyorlar");
		}
		else {
			System.out.println("Aynı objeyi göstermiyorlar");
		}
		
		
		
		
		
		
		
		
	}

}
