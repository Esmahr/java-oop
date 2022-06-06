package KalitimHayvanEx;

public class Aslan extends Hayvan {

    private String isim;

    public Aslan(String beslenme, int ayaksayisi) {
        super(ayaksayisi, beslenme);
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String hamYapti(int t1) {
        String sonuc;
        if (t1 < 6) {
            sonuc = "Tavşanı yedi.";
        } else
            sonuc = "Tavşan kaçtı";
        return sonuc;
    }

    @Override
    public String toString() {
        return "isim=" + getIsim() + "\n" +
                "Ayak sayısı: " + getAyakSayisi() + "\n" +
                " beslenme : "+ getBeslenme();
    }
}
