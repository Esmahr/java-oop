package PiramitEx;

public abstract class Prizmatik implements Piramit {

    public String isim;
    private Konum yer;
    private double yukseklik;

    public Prizmatik(String isim) {
        this.isim = isim;
    }

    public abstract double tabanAalanHesapla(double kenar);

    public Prizmatik(String isim, Konum yer, double yukseklik) {
        this.isim = isim;
        this.setYer(yer);
        this.setYukseklik(yukseklik);
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
    public double alanHesapla() {
        return 0;
    }

    @Override
    public double hacimHesapla() {
        return 0;
    }


    @Override
    public String toString() {
        return "Prizmatik{" + '\n' +
                "yüzey alanı: " + alanHesapla() + '\n' +
                "taban alanı: " + tabanAalanHesapla(yukseklik) + '\n' +
                "Konum: " + yer + '\n' +
                "hacim: " + hacimHesapla() +
                '}';
    }
}