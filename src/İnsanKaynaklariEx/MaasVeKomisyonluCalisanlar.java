package İnsanKaynaklariEx;

public class MaasVeKomisyonluCalisanlar extends KomisyonluCalisanlar {

    private double asgariUcret;

    public MaasVeKomisyonluCalisanlar(String isim, String soyisim, String tcKimlikno, double brutSatis, double komisyonOrani, double asgariUcret) {
        super(isim, soyisim, tcKimlikno, brutSatis, komisyonOrani);
        this.asgariUcret = asgariUcret;
    }


    public double getAsgariUcret() {
        return asgariUcret;
    }

    public void setAsgariUcret(double asgariUcret) {
        this.asgariUcret = asgariUcret;
    }


    public double kazanc(){
        return asgariUcret+super.kazanc();
    }


    @Override
    public String toString() {
        return "KomisyonluCalisanlar{" +
                "isim='" + super.getIsim() + '\'' +
                ", soyisim='" + super.getSoyisim()+ '\'' +
                ", tcKimlikno='" + super.getTcKimlikno() + '\'' +
                ", brutSatis=" + brutSatis +
                ", komisyonOrani=" + komisyonOrani +
                ", asgariUcret=" + asgariUcret +
                '}';
    }

}
