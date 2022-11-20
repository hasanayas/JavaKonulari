public class OgrenciNot {

    private String OgrenciAdSoyad;
    private Integer odevNot;
    private Integer vizeNot;
    private Integer finalNot;
    private Double genelOrtalama;

    public   OgrenciNot(String adsoyad){
        this.OgrenciAdSoyad = adsoyad;
    }

    public String getOgrenciAdSoyad(){
       return OgrenciAdSoyad;
    }

    public void setOgrenciAdSoyad(String ogrenciAdSoyad){
        this.OgrenciAdSoyad = ogrenciAdSoyad;
    }

    public Integer getOdevNot(){
        return odevNot;

    }
    public void setOdevNot(Integer odevNot){
        this.odevNot = odevNot;
        this.genelOrtalama = odevNot / 1.0d;
        System.out.println("Ogrenci Odev Notu: "+this.odevNot);
    }

    public Integer getVizeNot(){
        return vizeNot;
    }

    public void setVizeNot(Integer vizeNot){
        this.vizeNot = vizeNot;
        this.genelOrtalama= (this.odevNot + this.vizeNot) / 2.0d;
        System.out.println("Ogrenci Odev ve Vize Notu Ortalamasi:  " +this.genelOrtalama);
    }

    public Integer getFinalNot(){
        return finalNot;
    }

    public void setFinalNot(Integer finalNot){
        this.finalNot = finalNot;
        this.genelOrtalama = (this.odevNot+this.vizeNot+this.finalNot) / 3.0d;
        System.out.println("Ogrenci Genel Not Ortalamasi: " + this.genelOrtalama );
    }

     public Double getGenelOrtalama(){
        return genelOrtalama;
     }



    public static void main(String[] args) {
       OgrenciNot ogrenci = new OgrenciNot("Ali Veli");
       ogrenci.setOdevNot(55);
       ogrenci.setVizeNot(60);
       ogrenci.setFinalNot(75);

//       Çıktı
//        Ogrenci Odev Notu: 55
//        Ogrenci Odev ve Vize Notu Ortalamasi:  57.5
//        Ogrenci Genel Not Ortalamasi: 63.333333333333336
    }
}