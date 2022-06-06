package KalitimHayvanEx;

public class HayvanTest {
    public static void main(String[] args) {

        Kedi kedi = new Kedi(4,"et");
        kedi.setIsim("kedi");
        System.out.println(kedi);

        Aslan aslan = new Aslan("et",4);
        aslan.setIsim("aslan");
        System.out.println(aslan);

        System.out.println(aslan.hamYapti(4));

    }
}
