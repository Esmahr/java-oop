package KutuEx;

public class kutu {
    private double yukseklik;
    private double genislik;
    private double uzunluk;

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public kutu(){
        uzunluk = 5;
        genislik = 6;
        yukseklik = 7;
    }

    public double getHacim(){
        double hacim = getUzunluk()*getGenislik()*getYukseklik();
        return hacim;
    }

    public  double getYuzeyAlani(){
        double yüzeyAlani = 2*((getYukseklik()*getUzunluk())
                +(getYukseklik()*getGenislik())
                +(getGenislik()*getUzunluk()));
        return yüzeyAlani;
    }

    public static void main(String args[]){
        kutu k = new kutu();
        System.out.println("Yükseklik: "+k.getYukseklik());
        System.out.println("Uzunluk: "+k.getUzunluk());
        System.out.println("Genişlik: "+k.getGenislik());
        System.out.println("Yüzey alanı: "+k.getYuzeyAlani());
        System.out.println("Hacim: "+k.getHacim());
        System.out.println("--------------");
        k.setUzunluk(20);
        k.setYukseklik(10);
        k.setGenislik(10);
        System.out.println("Yükseklik: "+k.getYukseklik());
        System.out.println("Uzunluk: "+k.getUzunluk());
        System.out.println("Genişlik: "+k.getGenislik());
        System.out.println("Yüzey alanı: "+k.getYuzeyAlani());
        System.out.println("Hacim: "+k.getHacim());
    }

}//class kutu sonu, get getirmek, set değer atamak için.


