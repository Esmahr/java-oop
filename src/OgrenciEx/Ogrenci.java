package OgrenciEx;

public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String ogrNo;
    private double gano;
    private static final int bolumKodu = 141;
    private static int siraNo = 0;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        if (gano<0 || gano>4){
            throw new IllegalArgumentException("gano hatalı!");
        }
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public Ogrenci() {
        this(null, null, 2.5, "1988");
    }

    public Ogrenci(String ad, String bolum) {
        this(ad, bolum, 3.2, "1919");
    }

    public Ogrenci(String ad, String bolum, double gano, String girisYili) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano hatalı!");
        }
        this.setAd(ad);
        this.setBolum(bolum);
        this.setGano(gano);
        this.setGirisYili(girisYili);
    }//3 tane cons olmasının sebebi : constracter overloading

    //delegate const.
    public Ogrenci(Ogrenci ogrenci) {
        this(ogrenci.getAd(), ogrenci.getBolum(), ogrenci.getGano(), ogrenci.getGirisYili());
    }

    public static int getBolumKodu() {
        return bolumKodu;
    }

    public static int getSiraNo() {
        return siraNo;
    }

    public static void setSiraNo(int siraNo) {
        Ogrenci.siraNo = siraNo;
    }

    public String ogrNoOlustur() {
        setSiraNo(getSiraNo() + 1);
        if (getSiraNo() < 10) {
            setOgrNo("" + getGirisYili() + getBolumKodu() + "00" + getSiraNo());
        } else if (getSiraNo() < 100) {
            setOgrNo("" + getGirisYili() + getBolumKodu() + "0" + getSiraNo());
        }
        else
            setOgrNo("" + getGirisYili() + getBolumKodu() + "0" + getSiraNo());

        return getOgrNo();
    }

    public double harcHesap(int derssayisi){
        double harc = derssayisi*120;
        return harc;
    }

    public double harcHesap(int derssayisi, int uzatmalar){
        double harc = derssayisi*120*uzatmalar;
        return harc;
    }




}
