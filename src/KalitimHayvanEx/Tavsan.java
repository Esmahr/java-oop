package KalitimHayvanEx;

public class Tavsan extends Hayvan {

    private String isim;
    private int hiz;

    public Tavsan(String beslenme, int ayakSayisi,int hiz) {
        super(ayakSayisi, beslenme);
        this.hiz = hiz;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getHiz() {
        return hiz;
    }
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "isim=" + getIsim() + "\n" +
                "Ayak sayısı: " + getAyakSayisi() + "\n" +
                " hiz=" + hiz ;
    }
}
