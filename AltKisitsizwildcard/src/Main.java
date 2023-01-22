import java.util.ArrayList;

public class Main {

    public  static  Double ortalamaAl(ArrayList<? extends  Number >liste){
        Double toplam =0.0d;
        for (Number sayac : liste)
            toplam += sayac.doubleValue();

        return  toplam;

    }
    public static void main(String[] args) {
        ArrayList <Number> sayilar = new ArrayList<>();
        sayilar.add(22);
        sayilar.add(34.5d);
        sayilar.add(54.8d);
        sayilar.add(11);
        System.out.println(ortalamaAl(sayilar));
    }
}