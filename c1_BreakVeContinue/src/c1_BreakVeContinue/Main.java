package c1_BreakVeContinue;

public class Main {
	public static void main(String[] args) {
		/*
		 
		 	break deyimi, içinde bulunduğu döngüyü tamamen sonlandırır.
		 	Yani, döngüye ait kod bloğu içinde break deyimi ile karşılaşılırsa döngüden hemen çıkılır ve döngüden sonraki ilk satıra geçilir.
		 	
		 	
		 	
		 	continue deyimi ise döngünün o anki iterasyonunu atlar ve bir sonraki iterasyona geçer. 
		 	Yani, döngü içindeki bir koşul sağlandığında continue deyimi ile o iterasyondaki kalan kodlar çalıştırılmaz ve döngü bir sonraki adımına geçer.
		  
		  
		 */
		
		
		
		for (int i = 1;i <= 10;i++) {
			if(i == 5) {
				break; // i 5 olduğunda döngüden çık
			}
			System.out.println(i);
		}
		
		System.out.println("\n\n");
		
		for (int i = 1;i <= 10;i++) {
			if(i % 2 == 0) {
				continue; // Çift sayıları atla
			}
			System.out.println(i);
		}
		
		
	}

}
