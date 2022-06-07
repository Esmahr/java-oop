package PiramitEx;

public class PiramitTest {
    public static void main(String[] args) {

        Konik konik = new Konik("konik", 2, 3, 4, 90);
        Konum konum1 = new Konum(20, 40);
        konik.setYer(konum1);
        System.out.println(konik + "\n");

        UcgenPiramit ucgen = new UcgenPiramit("ucgen", 13, 10);
        Konum konum2 = new Konum(30, 50);
        ucgen.setYer(konum2);
        System.out.println(ucgen + "\n");

        DortgenPiramit dortgen = new DortgenPiramit("dortgen", 8, 12);
        Konum konum3 = new Konum(40, 60);
        dortgen.setYer(konum3);
        System.out.println(dortgen);


    }
}
