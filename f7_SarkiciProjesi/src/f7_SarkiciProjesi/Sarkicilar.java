package f7_SarkiciProjesi;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> şarkıcıListesi = new ArrayList<>();

    public void şarkıcılarıYazdır() {
        int listeBoyutu = şarkıcıListesi.size();
        for (int i = 0; i < listeBoyutu; i++) {
            System.out.println((i + 1) + ". şarkıcı: " + şarkıcıListesi.get(i));
        }
        if(listeBoyutu == 0) {
        	System.out.println("Listede Şuanda Eleman yok eleman ekleyin");
        }
    }

    public void şarkıcıEkle(String isim) {
        if (isim != null) {
            şarkıcıListesi.add(isim);
            System.out.println("Şarkıcı listesi " + isim + " isimli şarkıcı eklendi...");
        } else {
            System.out.println("Geçersiz isim!");
        }
    }

    public void şarkıcıGüncelle(String yeniİsim, int indeks) {
        if (indeks >= 0 && indeks < şarkıcıListesi.size()) {
            şarkıcıListesi.set(indeks, yeniİsim);
            System.out.println((indeks+1) + ". indeksdeki şarkıcı " + yeniİsim + " ile güncellendi");
        } else {
            System.out.println("Geçersiz indeks!");
        }
    }

    public void şarkıcıSil(int indeks) {
        if (indeks >= 0 && indeks < şarkıcıListesi.size()) {
            şarkıcıListesi.remove(indeks);
            System.out.println((indeks+1) + ". indeksdeki eleman silindi...");
        } else {
            System.out.println("Geçersiz indeks!");
        }
    }

    public void şarkıcıAra(String şarkıcıİsmi) {
        int pozisyon = şarkıcıListesi.indexOf(şarkıcıİsmi);
        if (pozisyon >= 0) {
            System.out.println(şarkıcıİsmi + " " + (pozisyon + 1) + ". sırada");
        } else {
            System.out.println("Şarkıcı Bulunamadı...");
        }
    }
}