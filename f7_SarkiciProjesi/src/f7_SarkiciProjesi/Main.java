package f7_SarkiciProjesi;

import java.util.Scanner;

public class Main {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("1- İşlemleri Görüntüle");
        System.out.println("2- Şarkıcıları Görüntüle");
        System.out.println("3- Şarkıcı Ekle");
        System.out.println("4- Şarkıcı Güncelle");
        System.out.println("5- Şarkıcı Sil");
        System.out.println("6- Şarkıcı Ara");
        System.out.println("7- Uygulamadan Çık");
    }

    public static void sarkicilariGoruntule() {
        sarkicilar.şarkıcılarıYazdır();
    }

    public static void sarkiciEkle() {
        System.out.print("Eklemek istediğiniz şarkıcının ismini girin: ");
        String isim = scanner.nextLine();
        sarkicilar.şarkıcıEkle(isim);
    }

    public static void sarkiciGuncelle() {
        System.out.print("Güncellemek istediğiniz indeks numarasını girin(1,2,3..): ");
        int indeks = scanner.nextInt();
        scanner.nextLine(); // Buffer'ı temizle
        System.out.print("Güncellemek istediğiniz yeni ismi girin: ");
        String yeniIsim = scanner.nextLine();
        sarkicilar.şarkıcıGüncelle(yeniIsim, indeks - 1);
    }

    public static void sarkiciSil() {
        System.out.print("Silmek istediğiniz indeksi girin: ");
        int indeks = scanner.nextInt();
        scanner.nextLine(); // Buffer'ı temizle
        sarkicilar.şarkıcıSil(indeks - 1);
    }

    public static void sarkiciAra() {
        System.out.println("Aranacak ismi girin");
        String aranacakIsim = scanner.nextLine();
        sarkicilar.şarkıcıAra(aranacakIsim);
    }

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Şarkıcı Uygulamasına Hoşgeldiniz");
        System.out.println("********************************");

        boolean cik = false;
        int islem;
        menu();
        
        while (!cik) {
            System.out.print("Bir işlem Seçiniz: ");
            islem = scanner.nextInt();
            scanner.nextLine(); // Buffer'ı temizle

            switch (islem) {
                case 1:
                    menu();
                    break;
                case 2:
                    sarkicilariGoruntule();
                    break;
                case 3:
                    sarkiciEkle();
                    break;
                case 4:
                    sarkiciGuncelle();
                    break;
                case 5:
                    sarkiciSil();
                    break;
                case 6:
                    sarkiciAra();
                    break;
                case 7:
                    cik = true;
                    System.out.println("Programdan Çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz işlem!");
            }
        }
    }
}