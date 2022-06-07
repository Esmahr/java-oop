package PiramitEx;

public class Konik implements Piramit {

    public String isim;
    private Konum yer;
    public double yarıCap;
    private double yukseklik;
    public double yanalYukseklik;
    public double alfaAcısı;

    public Konik(String isim) {
        this.isim = isim;
    }

    @Override
    public double alanHesapla() {
        return (3.14 * Math.pow(yarıCap, 2)) + (3.14 * yarıCap * yanalYukseklik);
    }

    @Override
    public double hacimHesapla() {
        double hesap = (1 / 3 * 3.14 * yukseklik * Math.pow(yarıCap, 2));
        return hesap;
    }

    public Konik(String isim, double yarıCap, double yukseklik, double yanalYukseklik, double alfaAcısı) {
        this.isim = isim;
        this.yarıCap = yarıCap;
        this.setYukseklik(yukseklik);
        this.yanalYukseklik = yanalYukseklik;
        this.alfaAcısı = alfaAcısı;
    }
    public Konum getYer() {
        return yer;
    }

    public void setYer(Konum yer) {
        this.yer = yer;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return "Konik{" + '\n' +
                "yüzey alanı: " + alanHesapla() + '\n' +
                "taban alanı: " + (3.14 * Math.pow(yarıCap, 2)) + '\n' +
                "Konum: " + yer + '\n' +
                "hacim: " + hacimHesapla() +
                '}';
    }
}

