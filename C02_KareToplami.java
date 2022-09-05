package day24_OdevForEach;

public class C02_KareToplami {
    public static void main(String[] args) {
        //bir integer array olusturun ve bu array'deki tum sayilarin karesinin toplamini
        //For-each loop kullanarak bulun

        int []sayilar={3,5,2,4};

        int toplam=0;
        for (int each:sayilar
        ) {
            toplam+=each*each;
        }
        System.out.println("sayilarinCarpimi = " + toplam);
    }
}
