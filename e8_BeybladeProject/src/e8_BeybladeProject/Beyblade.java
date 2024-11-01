package e8_BeybladeProject;

public class Beyblade {
	private String beybladeci;
	private int donusHizi;
	private int saldiriGucu;
	
	public void saldır() {
		System.out.println(beybladeci + " " + saldiriGucu + " gücü ve " + donusHizi + " hızı ile saldırıyor");
	}
	
	public void kutsalCanavarOrtayaCikar() {
		System.out.println("Bu beybladein kutsal canavarı yok..");
	}
	
	public void bilgileriGoster() {
		System.out.println("Beybladeci ismi : " + beybladeci);
		System.out.println("Saldırı Gücü : " + saldiriGucu);
		System.out.println("Dönüş Hızı : " + donusHizi);

	}
	
	public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
		this.beybladeci = beybladeci;
		this.donusHizi = donusHizi;
		this.saldiriGucu = saldiriGucu;
	}




	public String getBeybladeci() {
		return beybladeci;
	}




	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}




	public int getDonusHizi() {
		return donusHizi;
	}




	public void setDonusHizi(int donusHizi) {
		this.donusHizi = donusHizi;
	}




	public int getSaldiriGucu() {
		return saldiriGucu;
	}




	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}
	
	
	
	

}
