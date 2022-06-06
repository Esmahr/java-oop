package İnsanKaynaklariEx;

public class ikTest {
    public static void main(String[] args) {
        KomisyonluCalisanlar satisEleman = new KomisyonluCalisanlar(
                "Ali","veli","12121212", 10000,.2
        );
        System.out.println("isim: "+ satisEleman.getIsim());
        System.out.println(satisEleman);
        System.out.println(satisEleman.toString());
        System.out.println("maaş: "+satisEleman.kazanc());


        MaasVeKomisyonluCalisanlar sendikali = new MaasVeKomisyonluCalisanlar(
                "Mustafa","kara","123152426",20000,0.1,4250
        );

        System.out.println("sendikali: "+sendikali.toString());
        System.out.println("maaş: "+sendikali.kazanc());
    }
}
