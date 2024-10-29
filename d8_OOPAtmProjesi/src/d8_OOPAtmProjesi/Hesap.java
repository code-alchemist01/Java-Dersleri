package d8_OOPAtmProjesi;

public class Hesap {
	
	private String kullanici_adi;
	private String parola;
	private int bakiye;
	
	
	public Hesap(String kullanici_adi, String parola, int bakiye) {
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.bakiye = bakiye;
		
		
	}
	
	
	public void paraYatir(double miktar) {
		bakiye += miktar;
		System.out.println("Yeni Bakiyeniz: " + bakiye);
	}
	
	public void paraCek(double miktar) {
	
		if(bakiye >= miktar) {
			bakiye -= miktar;
			System.out.println("Yeni Bakiyeniz: " + bakiye);
		}
		else {
			System.out.println("Hesapta yeterli para yok. Güncel bakiyeniz: " + bakiye);
		}
	}
	


	public String getKullanici_adi() {
		return kullanici_adi;
	}


	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}


	public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}


	public int getBakiye() {
		return bakiye;
	}


	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
}
