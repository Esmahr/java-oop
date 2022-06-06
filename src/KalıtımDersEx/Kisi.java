package KalıtımDersEx;

public class Kisi {
    private String isim;
    private int dogumYili;

    public Kisi(String isim, int dogumYili) {
        this.isim = isim;
        this.dogumYili = dogumYili;
    }


    public int getYas() {
        return 2022-dogumYili;
    }

    public String getIsim() {

        return isim;
    }

    public void setIsim(String isim) {

        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "dogumYili=" + dogumYili +
                ", isim='" + isim + '\'' +
                '}';
    }
}
