package f4_HafızaOyunu;

public class Kart {
    private char kartDegeri;
    private boolean tahmin;

    // Constructor
    public Kart(char kartDegeri) {
        this.kartDegeri = kartDegeri;
        this.tahmin = false;
    }

    // Getter ve Setter metodları
    public char getKartDegeri() {
        return kartDegeri;
    }

    public void setKartDegeri(char kartDegeri) {
        this.kartDegeri = kartDegeri;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}