package KalıtımDersEx;

public class Ogrenci extends Kisi{
    private int girisYili;
    private String ogrNo;
    private Ders kaldıgıDers;
    private Object Kisi;

    public Ogrenci(String isim, int dogumYili, String ogrNo) {
        super(isim, dogumYili);
        this.ogrNo = ogrNo;
    }


    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {

        this.girisYili = girisYili;
    }

    public int girisyili(String ogrNo){
        girisYili = Integer.parseInt(ogrNo.substring(0,4));

        return girisYili;
    }

    public String getOgrNo() {

        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {

        this.ogrNo = ogrNo;
    }

    public Ders getKaldıgıDers() {

        return kaldıgıDers;
    }

    public void setKaldıgıDers(Ders kaldıgıDers) {

        this.kaldıgıDers = kaldıgıDers;
    }


    @Override
    public String toString() {
        return "Ogrenci{" + super.toString()+
                '\n' +"girisYili=" + girisyili(ogrNo) +
                ", ogrNo='" + ogrNo + '\'' + ", "+'\n'+
                "kaldıgıDers=" + kaldıgıDers +
                '}';
    }
}
