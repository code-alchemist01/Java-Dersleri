package e1_OOPInheritance;

public class Yonetici extends Calisan {
	
	private int sorumlu_kisi; // Ekstra özellik

	public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
		super(isim, maas, departman);
		this.sorumlu_kisi = sorumlu_kisi;
	}
	
	public void zamYap(int zam) {
		System.out.println("Çalışanlara " + zam + " tl zam yapıldı");
	}
	
	public void bilgilerigoster() {   // override
		System.out.println("İsim: " + getIsim() );
		System.out.println("Maaş: " + getMaas());
		System.out.println("Departman: " + getDepartman());
		System.out.println("Sorumlu kişi sayısı: " + sorumlu_kisi);
	}

}
