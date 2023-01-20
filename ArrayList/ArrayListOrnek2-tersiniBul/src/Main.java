import java.util.ArrayList;
public class Main {

   /* ● Bir ArrayList’i parametre alıp, tersten başlayacak şekilde başka bir ArrayList’e
    atayan (jenerik) tersiniBul metodu kodlayın.

     ● İki Integer tipindeki ArrayList paramere alıp, birleştirdikten sonra geriye
    birleştirilmiş diziyi döndüren (jenerik) listeleriBirlestir metodunu
    kodlayın.*/

   /* ÖR:
    liste = 1 2 3 4 5
    tersliste = 5 4 3 2 1
    birlestrilimisListe = 1 2 3 4 5 5 4 3 2 1*/

    public static ArrayList <Integer> tersiniBul(ArrayList<Integer> liste){
        ArrayList<Integer> tersListe = new ArrayList<>();
        int j =0;
        for(int i=0 ; i<liste.size(); i++ ){
          tersListe.add(liste.get(liste.size()-j-1));
          j++;
        }

        return tersListe;
    }

    public static ArrayList<Integer> listeleriBirlestir
            (ArrayList <Integer> liste1,ArrayList <Integer> liste2){

      ArrayList <Integer> birlesikListe = new ArrayList<>();

      //normal listeyi sonrada terslenmiş listeyi ekleyelim

        for (int i = 0; i<liste1.size(); i++){
            birlesikListe.add(liste1.get(i));
        }

        for (int i = 0; i<liste2.size(); i++){
            birlesikListe.add(liste2.get(i));
        }
        return birlesikListe;

    }

    public static void main(String[] args) {

       ArrayList <Integer>  sayiListesi = new ArrayList<>();
        sayiListesi.add(1);
        sayiListesi.add(2);
        sayiListesi.add(3);
        sayiListesi.add(4);
        sayiListesi.add(5);

        System.out.println(listeleriBirlestir(sayiListesi,tersiniBul(sayiListesi)));


    }
}