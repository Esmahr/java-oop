package NotOrtEx;

import java.util.Scanner;
public class NotOrt {

    public class Main {
        public static void main(String[] args) {

            Scanner vizeNot = new Scanner(System.in);
            System.out.println("Lütfen vize notunuzu girin: ");
            int vize = vizeNot.nextInt();

            Scanner finalNot = new Scanner(System.in);
            System.out.println("Lütfen final notunuzu girin: ");
            int finalPuani = finalNot.nextInt();

            if (finalPuani < 50) {
                System.out.println("Maalesef kaldınız:(");
            } else {
                String grade = "FF";

                if (notOrtalaması(vize, finalPuani) < 50)
                    grade = "FF";
                else if (notOrtalaması(vize, finalPuani) < 56)
                    grade = "CC";
                else if (notOrtalaması(vize, finalPuani) < 66)
                    grade = "CB";
                else if (notOrtalaması(vize, finalPuani) < 76)
                    grade = "BB";
                else if (notOrtalaması(vize, finalPuani) < 86)
                    grade = "BA";
                else if (notOrtalaması(vize, finalPuani) > 85)
                    grade = "AA";

                switch (grade) {
                    case "FF":
                        System.out.println("Ders notun: " + notOrtalaması(vize, finalPuani) + ", " + "Maalesef dersten kaldınız");
                        break;
                    case "CC":
                        System.out.println("Ders notun: " + notOrtalaması(vize, finalPuani) + ", " + "CC ile geçtin");
                        break;
                    case "CB":
                        System.out.println("Ders notun: " + notOrtalaması(vize, finalPuani) + ", " + "CB ile geçtin");
                        break;
                    case "BB":
                        System.out.println("Ders notun: " + notOrtalaması(vize, finalPuani) + ", " + "BB ile geçtin");
                        break;
                    case "BA":
                        System.out.println("Ders notun: " + notOrtalaması(vize, finalPuani) + ", " + "BA ile geçtin");
                        break;
                    case "AA":
                        System.out.println("Ders notun: " + notOrtalaması(vize, finalPuani) + ", " + "AA ile geçtin");
                        break;
                    default:
                        System.out.println("Geçersiz not girdiniz");
                }
            }
        }

        public static double notOrtalaması(int x, int y) {
            double ortalama = ((x * 40 / 100) + (y * 60 / 100));
            return ortalama;

        }
    }
}
