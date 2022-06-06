package KalıtımDersEx;

public class KisiTest {
    public static void main(String[] args) {

    Ogrenci ogrenci = new Ogrenci("esma", 2001,"2021123019");
    Ders ders = new Ders("Bil1002","OOP");
    ogrenci.setKaldıgıDers(ders);


    System.out.println(ogrenci.toString());
        System.out.println(" ");

    Temsilci tem = new Temsilci("Esma",2001,"1234567",2021);
        System.out.println(tem.toString());


}}
