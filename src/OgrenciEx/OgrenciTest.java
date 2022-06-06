package OgrenciEx;

public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci();
        Ogrenci o2 = new Ogrenci("Esma","bilgisayar");
        Ogrenci o3 = new Ogrenci("Sema","makina",2.5,"2022");


        System.out.println("******Ogrenciler*******");
        System.out.println("OGR-1 " + o1.getAd() + " " + o1.getBolum() + " " + o1.getGano() + " " + o1.getGirisYili());

        System.out.println("OGR-2 " + o2.getAd() + " " + o2.getBolum() + " " + o2.getGano() + " " + o2.getGirisYili());

        System.out.println("OGR-3 " + o3.getAd() + " " + o3.getBolum() + " " + o3.getGano() + " " + o3.getGirisYili());

        System.out.println("OGR-1 ogrNo: "+o1.ogrNoOlustur());
        System.out.println("OGR-3 ogrNo: "+o3.ogrNoOlustur());

        System.out.println("OGR-1 harç: "+ o1.harcHesap(4));
        System.out.println("OGR-1 harç: "+ o1.harcHesap(4,3));
    }
}
