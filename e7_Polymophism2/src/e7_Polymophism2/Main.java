package e7_Polymophism2;

class Hayvan {
	private String isim;

	public String ses_cikar() {
		return this.getIsim() + " ses çıkardı";
	}
	
	
	public Hayvan(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
}


class Kedi extends Hayvan {

	public Kedi(String isim) {
		super(isim);
	}

	@Override
	public String ses_cikar() {
		return this.getIsim() + " miyavlıyor";
	}
	
}


class Kopek extends Hayvan {

	public Kopek(String isim) {
		super(isim);
	}

	@Override
	public String ses_cikar() {
		return this.getIsim() + " havlıyor";
	}
	
}

class Eşşek extends Hayvan {

	public Eşşek(String isim) {
		super(isim);
	}

	@Override
	public String ses_cikar() {
		return this.getIsim() + " anırıyor";
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		// instanceof
		
		Kopek kopek = new Kopek("Rex");

		
		if(kopek instanceof Kopek) {  // bu nesne bu sınıftan mı demek
			System.out.println("Bu nesne köpek sınıfından ");
		}
		if(kopek instanceof Hayvan) {  // bu nesne bu sınıftan mı demek
			System.out.println("Bu nesne hayvan sınıfından ");
		}
		
	}

}


