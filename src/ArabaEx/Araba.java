package ArabaEx;

public class Araba {

    private double modelYili;
    private double motorHacmi;
    private String aracMarkasi;
    private String aracRengi;
    private  double  fiyat;

    public Araba(String aracMarkasi,String aracRengi, double modelYili, double fiyat, double motorHacmi){
        this.aracMarkasi = aracMarkasi;
        this.modelYili = modelYili;
        this.motorHacmi = motorHacmi;
        this.aracRengi = aracRengi;
        this.fiyat = fiyat;

    }


    public double getModelYili() {

        return modelYili;
    }
    public void setModelYili(double modelYili) {

        this.modelYili = modelYili;
    }

    public double getMotorHacmi() {

        return motorHacmi;
    }
    public void setMotorHacmi(double motorHacmi) {

        this.motorHacmi = motorHacmi;
    }

    public String getAracMarkasi() {

        return aracMarkasi;
    }
    public void setAracMarkasi(String aracMarkasi) {

        this.aracMarkasi = aracMarkasi;
    }

    public String getAracRengi() {

        return aracRengi;
    }
    public void setAracRengi(String aracRengi) {

        this.aracRengi = aracRengi;
    }

    public double getFiyat() {

        return fiyat;
    }
    public void setFiyat(double fiyat) {

        this.fiyat = fiyat;
    }

    public  double vergiHesapla(double motorHacmi, double modelYili){
        double yas = 2022-modelYili;
        double hacim = (motorHacmi/yas)*Math.pow(10,3);
        return hacim;
    }
}
