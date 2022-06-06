package KomisyonCalisanEx;

public class KomisyonCalisan extends Object {
    private final String isim;
    private final String soyIsim;
    private final String sosyalGuvenlikNumarasi;
    private double satis;
    private double komisyonOrani;

    public KomisyonCalisan(String isim, String soyIsim, String sosyalGuvenlikNumarasi, double satis, double komisyonOrani) {

        if (satis < 0.0) {
            throw new IllegalArgumentException("Satis >= 0.0 olmalıdır.");
        }
        if (komisyonOrani <= 0.0 || komisyonOrani >= 1.0) {
            throw new IllegalArgumentException("komisyon sayisi > 0.0 ve < 1.0 olmalıdır.");
        }

        this.isim = isim;
        this.soyIsim = soyIsim;
        this.sosyalGuvenlikNumarasi = sosyalGuvenlikNumarasi;
        this.setSatis(satis);
        this.setKomisyonOrani(komisyonOrani);
    }


    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public String getSosyalGuvenlikNumarasi() {
        return sosyalGuvenlikNumarasi;
    }

    public double getSatis() {
        return satis;
    }

    public void setSatis(double satis) {
        if (satis < 0.0) {
            throw new IllegalArgumentException("satis >= 0.0 olmalıdır.");
        }
        this.satis = satis;
    }

    public double getKomisyonOrani() {
        return komisyonOrani;
    }

    public void setKomisyonOrani(double komisyonOrani) {
        if (komisyonOrani <= 0.0 || komisyonOrani >= 1.0) {
            throw new IllegalArgumentException("komisyon satisi > 0.0 ve < 1.0 olmalıdır.");
        }
        this.komisyonOrani = komisyonOrani;
    }

    public double kazanç() {
        return satis * komisyonOrani;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "KomisyonCalisan= ", isim, soyIsim,
                "sosyalGuvenlikNumarasi= ", sosyalGuvenlikNumarasi,
                "satis= ", satis,
                "komisyonOrani= ", komisyonOrani);
    }
}
