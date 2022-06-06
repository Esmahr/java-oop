package İnsanKaynaklariEx;

public class KomisyonluCalisanlar {
    private String isim;
    private String soyisim;
    private String tcKimlikno;
    protected double brutSatis;
    protected double komisyonOrani;

    public KomisyonluCalisanlar(String isim, String soyisim, String tcKimlikno, double brutSatis, double komisyonOrani) {

        if (brutSatis<0.0)
            throw new IllegalArgumentException("Satis negatif olamaz.");

        if (komisyonOrani<=0.0 || komisyonOrani>=1.0)
            throw new IllegalArgumentException("Oran 0-1 arasında olmalı.");

        this.setIsim(isim);
        this.setSoyisim(soyisim);
        this.setTcKimlikno(tcKimlikno);
        this.setBrutSatis(brutSatis);
        this.setKomisyonOrani(komisyonOrani);
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTcKimlikno() {
        return tcKimlikno;
    }

    public void setTcKimlikno(String tcKimlikno) {
        this.tcKimlikno = tcKimlikno;
    }

    public double getBrutSatis() {
        return brutSatis;
    }

    public void setBrutSatis(double brutSatis) {

        if (brutSatis<0.0)
            throw new IllegalArgumentException("Satis negatif olamaz.");

        this.brutSatis = brutSatis;
    }

    public double getKomisyonOrani() {
        return komisyonOrani;
    }

    public void setKomisyonOrani(double komisyonOrani) {

        if (komisyonOrani<=0.0 || komisyonOrani>=1.0)
            throw new IllegalArgumentException("Oran 0-1 arasında olmalı.");

        this.komisyonOrani = komisyonOrani;
    }

    public double kazanc(){
        return brutSatis*komisyonOrani;
    }

    @Override
    public String toString() {
        return "KomisyonluCalisanlar{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcKimlikno='" + tcKimlikno + '\'' +
                ", brutSatis=" + brutSatis +
                ", komisyonOrani=" + komisyonOrani +
                '}';
    }
}
