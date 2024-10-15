package d1_MethodOverloading;

public class Main {
	
	public static void toplama(String a, String b) {
		System.out.println(a + b);
	}
	public static void toplama(int a,int b,int c) {
		System.out.println("Toplamları: " + (a + b + c));
	}
	public static void toplama(int a,int b) {
		System.out.println("Toplamları: " + (a + b ));
	}

	public static void main(String[] args) {
		/* bir sınıf içerisinde aynı isimde ancak farklı parametre listelerine sahip 
		 * birden fazla metot tanımlama işlemine metot aşırı yükleme veya overloading denir. 
		 * Bu sayede, aynı işlemi farklı girdilerle gerçekleştirebilen esnek ve kullanışlı metotlar oluşturabiliriz.*/
		 
		toplama(1,2);
		toplama(1,2,3);
		toplama("kutay"," mükemmeldir");
		
		

	}

}
