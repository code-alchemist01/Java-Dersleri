package d6_Constructor;

public class Main {

	public static void main(String[] args) {

		
	/*	Account ac1 = new Account("123456", 10000, "kutay", "ibrahimkutaysahin577@gmail.com", "02226666666"); // yazdığımız iki constructordan parametreli olanı çağırıp işlem yapar
		
		System.out.println("Bakiye = " + ac1.getBakiye());
		ac1.paraYatir(5678);
		System.out.println("Bakiye = " + ac1.getBakiye());
		ac1.paraCek(1000);
		System.out.println("Bakiye = " + ac1.getBakiye());
		ac1.paraCek(128883); */
		
		
		Account ac2 = new Account(); // yazdığımız iki constructordan parametresiz olanı çağırıp işlem yapar
		System.out.println(ac2.getBakiye());
		System.out.println(ac2.getEmail());
		
		
		Account ac3 = new Account("Kutay","a@gmail.com","82716261");
		System.out.println(ac3.getEmail());
		System.out.println(ac3.getIsim());
		
		ac3.bilgileriGoster();
		
		
	}

}
