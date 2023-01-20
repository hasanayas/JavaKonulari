import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



       /*
        .get(indeks_no) ilgili indeksteki veriyi getirir
        .size() liste boyutunu getirir
        .add(degisken) eleman ekler
        .remove(degişken) elemanı siler

        for(String eleman: liste){
        sout(eleman} listedeki her elemanı yazar

        VERİLENLERE GÖRE
        1-String elemanlardan oluşan ArrayList nesnesini oluşturun
        2-Eleman olarak “Ali” String’ini ekleyin.
        3-Eleman olarak “Veli” String’ini ekleyin.
        4-Listenin boyutunu ekrana yazdırın.
        5-Listenin ilk elemanını ekrana yazdırın.
        6-Listenin ilk elemanını “Hakan” olarak güncelleyin.
        7-Listenin ilk elemanını listeden çıkartın.
        8-Eleman olarak “Ayşe” String’ini ekleyin.
        9-Listenin elemanlarını alt alta konsola yazdırın
         */

        ArrayList<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Veli");
        System.out.println("Boyut: " + liste.size());
        System.out.println("Ilk eleman: " + liste.get(0));
        liste.set(0, "Hakan");
        liste.remove(0);
        liste.add("Ayşe");
        liste.add("Mehmet");
        liste.remove("Ayşe");

        liste.add("Hakan");
        System.out.println("Hakanın indeks değeri = "+liste.indexOf("Hakan"));
        System.out.println("Listenin elemanları-- ");
     /*   for(String eleman: liste)
            System.out.print(" "+eleman);

    }*/



        for (int i = 0; i < liste.size(); i++) {
            System.out.println(i+1+". eleman = "+ liste.get((i)));
        }
    }
}