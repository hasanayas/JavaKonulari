import java.util.Objects;

public class Ogrenci {

    private String adsoyad;
    private  Integer ogrencino;

    Ogrenci(String adsoyad, Integer ogrencino){
        this.adsoyad = adsoyad;
        this.ogrencino = ogrencino;
    }

    public String getAdsoyad(){
        return adsoyad;
    }
    public void setAdsoyad(String adsoyad){
        this.adsoyad = adsoyad;
    }

    public Integer getOgrencino(){
        return  ogrencino;
    }
    public void setOgrencino(Integer ogrencino){
        this.ogrencino = ogrencino;
    }

@Override
    public boolean equals(Object o){
        if(this == o ) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return Objects.equals(this.ogrencino, ogrenci.getOgrencino()) &&
        Objects.equals(this.adsoyad, ogrenci.getAdsoyad());

}

@Override
    public int hashCode(){
        return Objects.hash(ogrencino,adsoyad);
}

}

