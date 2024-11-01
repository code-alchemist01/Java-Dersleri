package e4_Composition;

public class Main {

	public static void main(String[] args) {

		Resolution resolution = new Resolution(1080, 720);
		Monitor monitor = new Monitor("Galaxy g9", "Samsung", "20.8", resolution);
		Kasa kasa = new Kasa("GXY9", "ASUS", "Elmas");
		Anakart anakart = new Anakart("B250PRO", "ASUS", 8, "Windows11");
		
		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
		
		pc.getKasa().bilgisayari_ac(); // composition --> iç içe objeler
		pc.getMonitor().monitoru_kapat();
		pc.getAnakart().isletim_sistemi_yukle("Kali Linux");
		
		
	}

}
