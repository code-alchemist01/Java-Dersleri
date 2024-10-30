package e1_OOPInheritance;

public class Test {

	public static void main(String[] args) {

		Yonetici y1 = new Yonetici("Kutay", 19000000, "CEO",100);
		
		y1.bilgilerigoster();
		y1.calis();
		y1.departman_degistir("Yönetim Kurulu Başkanı");
		y1.zamYap(10000);
	}

}
