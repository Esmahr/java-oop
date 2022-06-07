package PiramitEx;

public class DortgenPiramit extends Prizmatik {

    public double yanalYukseklik;
    public double tabanKenarı;

    public DortgenPiramit(String isim, double yanalYukseklik, double tabanKenarı) {
        super(isim);
        this.yanalYukseklik = yanalYukseklik;
        this.tabanKenarı = tabanKenarı;
    }

    @Override
    public double tabanAalanHesapla(double kenar) {
        return tabanKenarı * tabanKenarı;
    }

    @Override
    public double alanHesapla() {
        return (tabanKenarı * tabanKenarı) + ((yanalYukseklik * tabanKenarı / 2) * 4);
    }

    @Override
    public double hacimHesapla() {
        return (tabanKenarı * tabanKenarı) * (Math.sqrt((Math.pow(yanalYukseklik, 2) - Math.pow(tabanKenarı / 2, 2)))) / 3;
    }

    @Override
    public String toString() {
        return "dortgen piramit{" + '\n' +
                "yüzey alanı: " + alanHesapla() + '\n' +
                "taban alanı: " + tabanAalanHesapla(tabanKenarı) + '\n' +
                "Konum: " + super.getYer() + '\n' +
                "hacim: " + hacimHesapla() +
                '}';
    }
}
