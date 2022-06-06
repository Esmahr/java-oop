package EvEx;

public class EvTest {
    public static void main(String[] args){

        Ev ev1 = new Ev(2018.0,170,"Bostancı",3,325000);
        System.out.println("*********1.Ev**********");
        System.out.println("Evin bulunduğu semt:"+ev1.getSemt());
        System.out.println("Oda sayısı: "+ev1.getOdaSayisi());
        System.out.println("Evin inşa yılı: "+ev1.getInsaYili());
        System.out.println("Evin metrekaresi: "+ev1.getMetrekare());
        System.out.println("Evin fiyatı: "+ev1.getFiyat());
        System.out.println("Ödemeniz gereken emlak vergisi: "+ev1.getEmlakVergisi());

        System.out.println(" ");
        Ev ev2 = new Ev(2020.0,185,"Acıbadem",4,425000);
        System.out.println("*********2.Ev**********");
        System.out.println("Evin bulunduğu semt:"+ev2.getSemt());
        System.out.println("Oda sayısı: "+ev2.getOdaSayisi());
        System.out.println("Evin inşa yılı: "+ev2.getInsaYili());
        System.out.println("Evin metrekaresi: "+ev2.getMetrekare());
        System.out.println("Evin fiyatı: "+ev2.getFiyat());
        System.out.println("Ödemeniz gereken emlak vergisi: "+ev2.getEmlakVergisi());

        System.out.println(" ");
        int yeniOdaSayisi =5;
        ev2.setOdaSayisi(yeniOdaSayisi);
        System.out.println("*********2.Ev kentsel dönüşümü**********");
        System.out.println("YENİ Oda sayısı: "+ev2.getOdaSayisi());
        System.out.println("Ödemeniz gereken emlak vergisi: "+ev2.getEmlakVergisi());

    }
}
