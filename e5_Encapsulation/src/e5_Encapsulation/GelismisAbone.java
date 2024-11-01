package e5_Encapsulation;

public class GelismisAbone {  // encapsulationlı class

	
	private String isim;
	private int bakiye = 120;
	private String sehir;
	
	
	
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
	
	
	public GelismisAbone(String isim, int bakiye, String sehir) {
		this.isim = isim;
		
		if(bakiye >= 0 && bakiye < 120) {
			this.bakiye = bakiye;
		}
		this.sehir = sehir;
	}



	public String getIsim() {
		return isim;
	}



	public void setIsim(String isim) {
		this.isim = isim;
	}



	public int getBakiye() {
		return bakiye;
	}



	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}



	public String getSehir() {
		return sehir;
	}



	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	
	
	
	
}
