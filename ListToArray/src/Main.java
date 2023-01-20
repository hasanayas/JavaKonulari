import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public Double[] listeyiDiziyeDonustur(ArrayList<Double> liste){
        liste.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                if(o1 > o2) return 1;
                if(o2 <o1) return -1;
                else  return 0;
            }
        });
        Double[] dizi = new  Double[liste.size()];
        liste.toArray(dizi); //arraylist içeriğini diziye kopyalama
        return  dizi;

    }
    public static void main(String[] args) {
            ArrayList <Double> liste = new ArrayList<>();
            liste.add(2.4d);
            liste.add(64.4d);
            liste.add(86.32d);


    }
}