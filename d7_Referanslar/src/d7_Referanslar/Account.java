package d7_Referanslar;

public class Account {
	
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public void paraYatir(double miktar) {
		bakiye += miktar;
		System.out.println("Yeni Bakiyeniz: " + bakiye);
	}
	
	public void paraCek(double miktar) {
	
		if(bakiye >= miktar) {
			bakiye -= miktar;
		}
		else {
			System.out.println("Hesapta yeterli para yok. Güncel bakiyeniz: " + bakiye);
		}
	}
	
	
	public void bilgileriGoster() {
		System.out.println("Hesap No : " + this.hesapNo);
		System.out.println("Bakiye : " + this.bakiye);
		System.out.println("İsim : " + this.isim);
		System.out.println("Email : " + this.email);
		System.out.println("Telefon Numarası : " + this.telefonNo);
	}
	
	
	public Account() {          // Method overloading
		/* this.hesapNo = "Bilgi yok";
		this.bakiye = 0.0;
		this.isim = "Bilgi yok";
		this.email = "Bilgi yok";
		this.telefonNo = "Bilgi yok"; */ 
		
		this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok");	 
		
	}
	
	
	public Account(String isim,String email,String telefonNo) {           // Method overloading
		/* this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		this.bakiye = 0.0;
		this.hesapNo = "Bilgi yok"; // Constructor 3 parametreli olduğu için kalan parametrelere varsayılan değer atamamız lazım	*/
		
		
		this("Bilgi yok",0.0,isim,email,telefonNo); 		
	}
	
	
	public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {         // Method overloading
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		
	}

	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	
	
	
	
	

}
