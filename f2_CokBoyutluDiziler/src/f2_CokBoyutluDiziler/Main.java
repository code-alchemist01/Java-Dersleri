package f2_CokBoyutluDiziler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		int[][] array2 = new int[2][2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				array2[i][j] = scanner.nextInt();
			}
		}
		System.out.println("*******************************");
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
