package day24_OdevForEach;

import java.util.ArrayList;
import java.util.List;

public class C01_SayilarCarpimi {
    public static void main(String[] args) {
        //bir integer array olusturun ve bu array'deki tum sayilarin capimini
        //For-each loop kullanarak bulun

        int []sayilar={3,5,2,4};

        int toplam=1;
        for (int each:sayilar
             ) {
            toplam*=each;
        }
        System.out.println("sayilarinCarpimi = " + toplam);

    }
}
