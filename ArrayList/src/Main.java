import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
  /*      ArrayList <String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Veli");

        System.out.println(liste.size());

        System.out.println(liste.get(1));
        liste.set(1,"Hakan");
        liste.remove(1);
        liste.add("Ayşe");
        for(String eleman :liste)
            System.out.println(eleman);

   */

        ArrayList <Ogrenci> ogrenciler = new ArrayList<>();
        Ogrenci ogrenci1 = new Ogrenci("Hasan",1234);
        Ogrenci ogrenci2 = new Ogrenci("Murat", 9876);
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);

        Ogrenci kopyaOgrenci1 = new Ogrenci("Hasan",1234);
      boolean sonuc =  ogrenciler.contains(kopyaOgrenci1);
        System.out.println(sonuc);



        //iterator kullanımı
        ArrayList liste = new ArrayList<>();
        liste.add(55);
        liste.add("Hasan");
        liste.add(22);
        liste.add(false);
        liste.add(2.65);

        Iterator iterator = liste.iterator();
        while(iterator.hasNext()) {

            Object eleman =iterator.next();
            System.out.println(eleman);
        }


        // arraylist içeriğini integera kopyalayaln kod

        System.out.println("************************************");

        ArrayList <Integer> integerListe = new ArrayList<>();
        integerListe.add(12);
        integerListe.add(32);
        integerListe.add(64);
        integerListe.add(13);

        Integer[] dizi = new  Integer[integerListe.size()];
        integerListe.toArray(dizi);

        for(Integer eleman: dizi)
            System.out.println(eleman);



    }
}