package KomisyonCalisanEx;

public class KomisyonCalisanTest {
    public static void main(String[] args) {
        KomisyonCalisan calisan = new KomisyonCalisan("Esma", "Harmancı", "123456789", 10000, 0.06);

        System.out.println("get yöntemleriyle elde edilen çalışan bilgileri:");
        System.out.printf("%n%s %s%n", "Isim",
                calisan.getIsim());
        System.out.printf("%s %s%n", "Soyisim",
                calisan.getSoyIsim());
        System.out.printf("%s %s%n", "Sosyal güvenlik numarası",
                calisan.getSosyalGuvenlikNumarasi());
        System.out.printf("%s %.2f%n", "Satis",
                calisan.getSatis());
        System.out.printf("%s %.2f%n", "Komisyon satis",
                calisan.getKomisyonOrani());
        System.out.println(" ");

        System.out.println("toString tarafından elde edilen güncellenmiş çalışan bilgileri"+'\n');
        calisan.setSatis(5000);
        calisan.setKomisyonOrani(.1);
        System.out.println(calisan.toString());

    }
}
