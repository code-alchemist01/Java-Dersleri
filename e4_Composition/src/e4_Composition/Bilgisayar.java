package e4_Composition;

public class Bilgisayar {

	private Monitor monitor; // composition
	private Kasa kasa; // composition
	private Anakart anakart; // composition
	
	
	
	public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {
		this.monitor = monitor;
		this.kasa = kasa;
		this.anakart = anakart;
	}



	public Monitor getMonitor() {
		return monitor;
	}



	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}



	public Kasa getKasa() {
		return kasa;
	}



	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}



	public Anakart getAnakart() {
		return anakart;
	}



	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	
	
	
	
}
