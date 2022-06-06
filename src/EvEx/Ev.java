package EvEx;

public class Ev {

    private double insaYili;
    private int metrekare;
    private String semt;
    private int odaSayisi;
    private double fiyat;

    public Ev(Double insaYili, int metrekare, String semt, int odaSayisi, double fiyat){
        this.setInsaYili(insaYili);
        this.setMetrekare(metrekare);
        this.setSemt(semt);
        this.setOdaSayisi(odaSayisi);
        this.setFiyat(fiyat);
    }


    public double getInsaYili() {
        return insaYili;
    }

    public void setInsaYili(double insaYili) {
        this.insaYili = insaYili;
    }

    public int getMetrekare() {
        return metrekare;
    }

    public void setMetrekare(int metrekare) {
        this.metrekare = metrekare;
    }

    public String getSemt() {
        return semt;
    }

    public void setSemt(String semt) {
        this.semt = semt;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getEmlakVergisi(){
        double vergi = (fiyat*odaSayisi*metrekare)/Math.pow(10,5);
        return vergi;
    }
}
