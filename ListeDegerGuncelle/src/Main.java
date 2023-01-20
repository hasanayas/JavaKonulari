import java.util.ArrayList;

public class Main {

    public static void listeDegerGuncelle(ArrayList<Integer> liste, int aranan, int yeniDeger){
        int indeks = liste.indexOf(aranan); //aranan değerin indeksi aranır
        if(indeks != -1) { // aranan eleman listede var mı yok mu
            liste.set(indeks, yeniDeger);
            System.out.println("Liste Guncellendi. Eski deger = "+ aranan+ " Yeni Değer = "+ yeniDeger);
        }
        else
            System.out.println("Aradıgınız deger dizide yok");;

    }
    public static void main(String[] args) {
        ArrayList <Integer> liste = new ArrayList<>();
        liste.add(22);
        liste.add(34);
        liste.add(06);

        listeDegerGuncelle(liste,21,33);
        System.out.println("*************************");
        listeDegerGuncelle(liste,22,35);

        System.out.print("Liste elemanları: ");
        for(Integer eleman: liste)
            System.out.print(eleman+ " ");

    }
}