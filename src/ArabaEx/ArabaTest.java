package ArabaEx;
import java.util.Scanner;

public class ArabaTest {

    public static void main(String args[]) {
        Araba araba1 = new Araba("Honda","Beyaz", 2020 , 305000, 2.3);

        System.out.println("Arabanın markası: "+ araba1.getAracMarkasi());
        System.out.println("Arabanın rengi: "+ araba1.getAracRengi());
        System.out.println("Arabanın model yılı: "+ araba1.getModelYili());
        System.out.println("Arabanın fiyatı: " + araba1.getFiyat());
        System.out.println("Ödemeniz gereken vergi fiyatı: "+ araba1.vergiHesapla(araba1.getMotorHacmi(), araba1.getModelYili()));

        Scanner in = new Scanner(System.in);
        System.out.print("renk gir: ");
        String yeniRenk = in.nextLine();
        araba1.setAracRengi(yeniRenk);

        System.out.println("Arabanın rengi: "+ araba1.getAracRengi());
    }
}
