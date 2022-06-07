package PiramitEx;

public class UcgenPiramit extends Prizmatik {
    public double yanalYukseklik;
    public double tabanKenarı;

    public UcgenPiramit(String isim, double yanalYukseklik, double tabanKenarı) {
        super(isim);
        this.yanalYukseklik = yanalYukseklik;
        this.tabanKenarı = tabanKenarı;
    }

    @Override
    public double tabanAalanHesapla(double kenar) {
        return ((Math.sqrt((Math.pow(tabanKenarı, 2) - (Math.pow(tabanKenarı / 2, 2))))) * tabanKenarı / 2);
    }

    @Override
    public double alanHesapla() {
        return ((Math.sqrt((Math.pow(tabanKenarı, 2) - (Math.pow(tabanKenarı / 2, 2))))) * tabanKenarı / 2) + ((yanalYukseklik * tabanKenarı / 2) * 3);
    }

    @Override
    public double hacimHesapla() {
        return ((Math.sqrt((Math.pow(tabanKenarı, 2) - (Math.pow(tabanKenarı / 2, 2))))) * tabanKenarı / 2) * (Math.sqrt(Math.pow(yanalYukseklik, 2) - Math.pow(tabanKenarı / 2, 2)) / 3);
    }

    @Override
    public String toString() {
        return "ucgen piramit{" + '\n' +
                "yüzey alanı: " + alanHesapla() + '\n' +
                "taban alanı: " + tabanAalanHesapla(tabanKenarı) + '\n' +
                "Konum: " + super.getYer() + '\n' +
                "hacim: " + hacimHesapla() +
                '}';
    }
}
