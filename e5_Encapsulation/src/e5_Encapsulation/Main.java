package e5_Encapsulation;

public class Main {
	public static void main(String[] args) {
		
		Abone abone = new Abone();
		
		abone.isim = "Kutay";
		abone.bakiye = 200;
		abone.sehir = "Ordu";
		
		abone.dogalgaz_kullan(200);
		
		System.out.println("****************************");
		
		GelismisAbone  gabone = new GelismisAbone("kutay",  105 , "ordu"); 
		gabone.bakiye_ogren();
		gabone.dogalgaz_kullan(100);
		gabone.bakiye_ogren();
		
	}
 
}
