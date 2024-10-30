package e2_OOPInheritance2;

public class Hayvan {

	private String isim;
	private int kilo;
	private int boy;
	private int bacak_sayisi;
	
	
	
	public void yemekYe() {
		System.out.println("Hayvan Şu anda yemek yiyor...");
	}
	
	public void hareketeGec(int hız) {
		System.out.println("Hayvan " + hız + " ile hareket halinde");
	}
	
	public Hayvan(String isim, int kilo, int boy, int bacak_sayisi) {
		this.isim = isim;
		this.kilo = kilo;
		this.boy = boy;
		this.bacak_sayisi = bacak_sayisi;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getKilo() {
		return kilo;
	}
	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	public int getBacak_sayisi() {
		return bacak_sayisi;
	}
	public void setBacak_sayisi(int bacak_sayisi) {
		this.bacak_sayisi = bacak_sayisi;
	}
	
	
	
	
}
