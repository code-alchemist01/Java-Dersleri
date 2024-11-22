package f4_HafızaOyunu;

import java.util.Scanner;

public class Main {

    private static Kart[][] oyun = new Kart[4][4];

    public static void main(String[] args) {
        // Kartların başlatılması
        oyun[0][0] = new Kart('E');
        oyun[0][1] = new Kart('A');
        oyun[0][2] = new Kart('B');
        oyun[0][3] = new Kart('F');
        oyun[1][0] = new Kart('G');
        oyun[1][1] = new Kart('A');
        oyun[1][2] = new Kart('D');
        oyun[1][3] = new Kart('H');
        oyun[2][0] = new Kart('F');
        oyun[2][1] = new Kart('C');
        oyun[2][2] = new Kart('D');
        oyun[2][3] = new Kart('H');
        oyun[3][0] = new Kart('E');
        oyun[3][1] = new Kart('G');
        oyun[3][2] = new Kart('B');
        oyun[3][3] = new Kart('C');

        // Scanner nesnesi sadece bir kere oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Oyun bitene kadar devam et
        while (gameOver() == false) {
            oyunTahtasi();
            tahminEt(scanner);
        }

        // Scanner nesnesi kapatılır
        scanner.close();
    }

    public static void tahminEt(Scanner scanner) {
        System.out.println("Birinci tahmin (i ve j değerlerini bir boşluklu olacak şekilde girin....): ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        oyun[i1][j1].setTahmin(true); // İlk tahmin yapılır
        oyunTahtasi();

        System.out.println("İkinci tahmin (i ve j değerlerini bir boşluklu olacak şekilde girin....): ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        oyun[i2][j2].setTahmin(true); // İkinci tahmin yapılır
        oyunTahtasi();

        if (oyun[i1][j1].getKartDegeri() == oyun[i2][j2].getKartDegeri()) {
            System.out.println("Kartlar eşleşti!");
        } else {
            // Eşleşmeyen kartlar geri çekilir
            oyun[i1][j1].setTahmin(false);
            oyun[i2][j2].setTahmin(false);
        }
    }

    public static boolean gameOver() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (oyun[i][j].isTahmin() == false) {
                    return false; // Eğer tüm kartlar tahmin edilmemişse oyun devam eder
                }
            }
        }
        return true; // Tüm kartlar tahmin edilirse oyun biter
    }

    public static void oyunTahtasi() {
        System.out.println("Oyun Tahtası:");
        for (int i = 0; i < 4; i++) {
            System.out.println("___________________");
            for (int j = 0; j < 4; j++) {
                if (oyun[i][j].isTahmin()) {
                    System.out.print(" |" + oyun[i][j].getKartDegeri() + "| ");
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}