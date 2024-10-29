package d8_OOPAtmProjesi;

public class Main {

	public static void main(String[] args) {
		Hesap hesap = new Hesap("Kutay", "1234", 100000);	
		ATM atm = new ATM();
		atm.calis(hesap);
		System.out.println("Programdan çıkılıyor...");

	}

}
