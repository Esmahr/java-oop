package ArraysEx;

import java.util.*;

public class arraysDeneme {
    public static void main(String[] args) {

        int[] dizi1 = new int[10];

        for (int i = 0; i < dizi1.length; i++) {
            dizi1[i] = (int) (Math.random() * 50);
        }
        System.out.println("Dizi elemanları: " + Arrays.toString(dizi1));

        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1.length-1; j++) {
                int temp1;
                if (dizi1[j] > dizi1[j+1]) {
                    temp1 = dizi1[j+1];
                    dizi1[j+1] = dizi1[j];
                    dizi1[j] = temp1;
                }
            }
        }
        System.out.println("Küçükten büyüğe sıralanmış dizi elemanları: " + Arrays.toString(dizi1));

        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1.length-1; j++) {
                int temp2;
                if (dizi1[j]<dizi1[j+1]){
                    temp2 = dizi1[j];
                    dizi1[j]=dizi1[j+1];
                    dizi1[j+1]=temp2;
                }
            }
        }
        System.out.println("Büyükten küçüğe sıralanmış dizi elemanları: " + Arrays.toString(dizi1));

        System.out.println("Dizi elemanları toplamı: "+ toplam(dizi1));
        System.out.println("Dizi elemanları ortalaması: "+ ortalama(dizi1));
    }

    public static int toplam(int[] dizi){
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];
        }
        return toplam;
    }

    public static  double ortalama(int[] dizi){
        double ortalama = toplam(dizi)/ dizi.length;
        return ortalama;
    }
}
