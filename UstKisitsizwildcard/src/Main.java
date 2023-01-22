import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void  yazdir(ArrayList<? super Meyve> meyve){ //Meyveye kadar özelleştirilebilen wilcard
        for(Object obj : meyve){
            if(obj instanceof  Meyve){
                Meyve yeniMeyve = (Meyve)  obj;
                System.out.print(yeniMeyve.getAdi() + ",");
            }
            else
                System.out.print(obj+", ");
        }

    }

//Tip Kısıtsız

    public static void tipKisitsizwildcardYazdir(ArrayList<?> liste){
        for (Object obj : liste){
            Meyve meyve = (Meyve) obj;
            System.out.println(((Meyve) obj).getAdi());
    }
        }
    public static void main(String[] args) {
        ArrayList<Meyve> meyveListesi = new ArrayList<>();
        Meyve elma = new Meyve("Elma");
        Meyve elma2 = new Meyve("Elma2");
        meyveListesi.add(elma);
        meyveListesi.add(elma2);
        yazdir(meyveListesi);

        System.out.println("***************************");
        ArrayList<Object> objeListesi = new  ArrayList<>();
        Meyve elma3 = new Elma();
        objeListesi.add("Uzum");
        objeListesi.add("Armut");
        objeListesi.add(elma3);
        yazdir(objeListesi);

        ArrayList<Elma> elmaListesi = new ArrayList<>();
        Elma elma4 = new Elma();
        elmaListesi.add(elma4);

      /*  yazdir(elmaListesi); Derleyici hatası verir, çünkü yazdır methodu Alt Sınıf olarak meyvelere kadar özelleştirilebilir*/
        System.out.println("----------------------------");

        //Tip Kısıtsız

        System.out.print("Meyve Listesi = ");
        tipKisitsizwildcardYazdir(meyveListesi);

        System.out.print("Elma Listesi = ");
        tipKisitsizwildcardYazdir(elmaListesi);

      /*  System.out.print("Obje Listesi = ");
        tipKisitsizwildcardYazdir(objeListesi);*/

    }
}