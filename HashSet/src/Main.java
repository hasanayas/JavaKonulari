import java.util.HashSet;
import java.util.Iterator;

public class Main {
  /*  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    hashSet.add(15);
    hashSet.add(5);
    hashSet.add(25);
    hashSet.add("Ali");

    Iterator iterator = hashSet.iterator();
    while (iterator.hasNext()) {
        Object next = iterator.next();
        System.out.println(next);
    }

        for (Object obj : hashSet) {
            System.out.println(obj);
        }
}*/
  public static void main(String[] args) {

     /* HashSet veriler = new HashSet();
      veriler.add(15);
      veriler.add(5);
      veriler.add(25);

      Integer toplam = 0;


      for (Object obj : veriler) {
          Integer sayisalDeger = (Integer) obj;
          toplam += sayisalDeger;
      }
      System.out.println("Toplam: " + toplam);*/

      HashSet<Integer> veriler = new HashSet<>();
      veriler.add(15);
      veriler.add(5);
      veriler.add(25);
      Integer toplam = 0;
      Iterator<Integer> iterator = veriler.iterator();
      while (iterator.hasNext())
          toplam += iterator.next();
      System.out.println("Toplam: " + toplam);
  }
}