package d5_OOPGiris;

public class Main {

	public static void main(String[] args) {

		Araba a1 = new Araba();
		
		/* a1.renk = "Siyah";
		a1.kapilar = 4;
		a1.tekerlekler = 4;
		a1.motor = "BMW";
		a1.motor = "1.6V";
		
		System.out.println(a1.motor);  // Değişkenler araba sınıfında private olduğu için getter setter dışında erişmek mümkün değil
*/
		
		a1.setKapilar(4);
		System.out.println(a1.getKapilar());
		
		a1.setModel("BMW");
		System.out.println(a1.getModel());
		
	}

}
