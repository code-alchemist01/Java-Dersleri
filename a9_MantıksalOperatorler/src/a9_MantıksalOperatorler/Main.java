package a9_MantıksalOperatorler;

public class Main {

	public static void main(String[] args) {
		
		/*
			&& ---> and operatörü = Bütün şartlar true ise true olur. 
			Herhangi bir ifade false ise false olur
			
			|| ---> or operatörü = Herhangi bir şart true ise true olur.
			
			! ---> not operatörü = tersi anlamı taşır

		*/
		
		System.out.println(3 == 3 && 4 != 5); // iki şartta true olduğu için true döner
		System.out.println(3 == 3 && 4 != 4); // ikinci şart false olduğu için false döner
		System.out.println(3 == 3 || 4 != 5); // iki şartta true olduğu için true döner
		System.out.println(3 == 3 || 4 != 4); // herhangi bir şart true olduğu için true
		System.out.println(!(3 == 3)); // normalde true olan ifade not ibaresinden dolayı false olur
		System.out.println(!(3 != 3)); // normalde false olan ifade not ibaresinden dolayı true olur
		
		
		
	}

}
