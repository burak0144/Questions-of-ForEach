package day24_OdevForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_CharacterYazdirma {
    public static void main(String[] args) {
        //bir string olusturun,bu string'deki character'leri for-each loop kullanarak yazdirin
        //ip ucu:split()

        String arr1[]={"ali","ayse","veli","ahmet","mehmet"};
        String hece="";
        for (String each:arr1
             ) {
            hece+=each;


        }arr1=hece.split("");
        System.out.println("characterler = " + Arrays.toString(arr1));
    }
}
