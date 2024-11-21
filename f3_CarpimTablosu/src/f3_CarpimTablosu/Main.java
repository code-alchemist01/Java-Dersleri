package f3_CarpimTablosu;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		int[][] array2 = new int[2][2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j  +  " = " + (i*j) );
			}
			System.out.println("------------------------------");
		}
	
	}

}
