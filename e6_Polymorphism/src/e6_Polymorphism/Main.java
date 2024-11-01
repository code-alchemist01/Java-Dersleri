package e6_Polymorphism;

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
		Hayvan hayvan = new Hayvan("Abigal");
		Hayvan kedi = new Kedi("Boncuk"); // Bu şekilde alt sınıf üst sınıf şeklinde de yazabiliyoruz
		Kopek kopek = new Kopek("Rex");
		Eşşek eşşek = new Eşşek("Siyahi");
		
		System.out.println(hayvan.ses_cikar());
		System.out.println(kedi.ses_cikar());
		System.out.println(kopek.ses_cikar());
		System.out.println(eşşek.ses_cikar());


		
	}

}
