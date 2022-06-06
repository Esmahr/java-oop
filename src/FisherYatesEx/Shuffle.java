package FisherYatesEx;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Öncesi: " + Arrays.toString(dizi));
        random(dizi);
        System.out.println("Sonrası: " + Arrays.toString(dizi));
    }

    public static void random(int[] dizi) {
        Random sayi = new Random();
        for (int i = dizi.length - 1; i > 0; i--) {
            int j = sayi.nextInt(i);

            int temp = dizi[i];
            dizi[i] = dizi[j];
            dizi[j] = temp;
        }
    }
}
