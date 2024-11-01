package e5_Encapsulation;

public class Abone { // Encapsulationsız class
	
	public String isim;
	public int bakiye;
	public String sehir;
	
	public void dogalgaz_kullan(int miktar) {
		if(this.bakiye - miktar < 0) {
			System.out.println("Yeterli bakiye yok");
		}
		else {
			this.bakiye -= miktar;
			
			if(this.bakiye <= 0) {
				System.out.println("Bakiyeniz bitmiştir. Yükleme yapınız. Kredi Limiti = 150 TL");
			}
			else {
				System.out.println("Yeni bakiye = " + bakiye);
			}
		}
	}
	
	public void bakiye_ogren() {
		System.out.println("Bakiye : " + bakiye);
	}
	

}
