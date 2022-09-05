package day24_OdevForEach;

import java.util.ArrayList;
import java.util.List;

public class C03_OrtakEleman {
    public static void main(String[] args) {
        //iki string array olusturun ve bu array'lerdeki ortak elemanlari
        //For-each loop kullanarak bulun.Ortak eleman yoksa ekrana ortak eleman yok yazdirin
        String arr1[]={"ali","ayse","veli","ahmet","mehmet"};
        String arr2[]={"ali","veli","mahmut","metin","ayse"};
        List<String> arr3=new ArrayList<>();
        for (String each1:arr1
             ) {
            for (String each2 : arr2
            ){
                if(each1.equals(each2)){
                    arr3.add(each1);
                }
            }
        }if(arr3.isEmpty()){
            System.out.println("ortak eleman yoktur");
        }else{
            System.out.println("ortak elemanlar = " + arr3);}
    }
}
