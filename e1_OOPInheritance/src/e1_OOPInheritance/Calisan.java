package e1_OOPInheritance;

public class Calisan {

	private String isim;
	private int maas;
	private String departman;
	
	
	public void calis() {
		System.out.println("Çalışan çalışıyor");
	}
	
	public void bilgilerigoster() {
		System.out.println("İsim: " + isim );
		System.out.println("Maaş: " + maas);
		System.out.println("Departman: " + departman);
	}
	
	public void departman_degistir(String yeni_departman) {
		System.out.println("Departman değiştiriliyor...");
		this.departman = yeni_departman;
		System.out.println("Yeni Departman: " + this.departman);
	}
	
	
	public Calisan(String isim, int maas, String departman) {
		super();
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	
	
	
}
