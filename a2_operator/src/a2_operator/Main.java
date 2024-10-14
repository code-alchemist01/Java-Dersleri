package a2_operator;

public class Main {

	public static void main(String[] args) {
		/*
		 	+ --> Toplama İşareti
		 	- --> Çıkarma İşlemi
		 	/ --> Bölme İşlemi
		 	* --> Çarpma İşlemi
		 	% --> Mod İşlemi
		 	
		 	
		 	&& --> And Operatörü
		 	|| --> Or Operatörü
		 	! --> Not Operatörü
		 	
		  	++ --> arttırma operatörü
		  	-- --> azaltma operatörü
		  
		   */
		
		System.out.println(10 + 2);
		System.out.println(25 - 3);
		System.out.println(36 / 6);
		System.out.println(21 * 2);
		System.out.println(35 % 11);
		
		if(true && true) {
			System.out.println("And Operatörü ikiside doğru olduğu için çalıştı");
		}
		
		/* if(true && false) {
		} */  // And Operatöründe false biri bile yanlış olursa ölü kod olur çalışmaz
		
		if(true || true) {
			System.out.println("Or Operatörü ikiside doğru olduğu için çalıştı");
		}
		
		if(true || false) {
			System.out.println("Or Operatörü biri doğru olsa bile çalıştı");
		}
		
		
		int a = 5;
		int b = 10;
		int c = 21;
		int d = 18;
		
		System.out.println(a++); // Önce değişkeni döndür sonra arttır
		System.out.println(b--); // Önce değişkeni döndür sonra azalt
		System.out.println(++c); // Önce arttır sonra değişkeni döndür
		System.out.println(--d); // Önce azalt sonra değişkeni döndür
		
	}

}
