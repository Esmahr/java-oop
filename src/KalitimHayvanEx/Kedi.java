package KalitimHayvanEx;

public class Kedi extends Hayvan {

    private String isim;
    private boolean isEvcil;

    public Kedi(int ayaksayisi, String beslenme) {
        super(ayaksayisi, beslenme);

    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isEvcil() {
        return isEvcil;
    }
    public void setEvcil(boolean evcil) {
        isEvcil = evcil;
    }

    @Override
    public String toString() {
        return "isim=" + getIsim() + "\n" +
                "Ayak sayısı: " + getAyakSayisi() + "\n" +
                "evcil mi: " + isEvcil;

    }
}
