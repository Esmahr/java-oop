package KalıtımDersEx;

public class Temsilci extends Ogrenci {
    private int sinifDuzeyi;


    public Temsilci(String isim, int dogumYili, String ogrNo, int girisyili) {
        super(isim, dogumYili, ogrNo);
        this.sinifDuzeyi =2022-girisyili;
    }

    public int getSinifDuzeyi() {
        return sinifDuzeyi;
    }

    public void setSinifDuzeyi(int sinifDuzeyi) {

        this.sinifDuzeyi = sinifDuzeyi;
    }

    @Override
    public String toString() {
        return "Temsilci{" + super.toString()+'\n'+
                "sinifDuzeyi=" + sinifDuzeyi +
                '}';
    }
}
