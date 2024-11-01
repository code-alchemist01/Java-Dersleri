package e8_BeybladeProject;

public class beybladeFabrikası {
	
	public Beyblade beybladeUret(String beyblade_turu) {
		
		
		if(beyblade_turu.equals("Dragon")) {
			return new Dragon("Takao", 1000, 2000, "Mavi Ejderha", "Kutsal Canavarla Konuşma");
		}
		else if(beyblade_turu.equals("Draciel")) {
			return new Draciel("Max", 500, 750, "Kara Kamplumbağa");
		}
		else if(beyblade_turu.equals("Drayga")) {
			return new Drayga("Rei", 900, 450, "Beyaz Kaplan");
		}
		else if(beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai", 500, 1200, "Kırmızı Anka Kuşu");
		}
		else {
			return null;
		}
		
		
	}

}
