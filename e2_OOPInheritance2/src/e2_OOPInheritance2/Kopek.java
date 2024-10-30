package e2_OOPInheritance2;

public class Kopek extends Hayvan {

	private int dis_sayisi;

	
	public Kopek(String isim, int kilo, int boy, int bacak_sayisi,int dis_sayisi) {
		super(isim, kilo, boy, bacak_sayisi);
		this.dis_sayisi = dis_sayisi;
	}

	
	public void kos(int hız) {
		System.out.println("Köpek Koşuyor");
		super.hareketeGec(hız); // Hayvan sınıfından metod çağırdık
	}
	
	

	public int getDis_sayisi() {
		return dis_sayisi;
	}


	public void setDis_sayisi(int dis_sayisi) {
		this.dis_sayisi = dis_sayisi;
	}

	
	
}
