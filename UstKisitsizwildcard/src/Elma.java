public class Elma extends  Meyve{
    private String renk;

    public Elma(){
        super("elma");
        this.renk = "kirmizi";
    }
    public Elma (String renk){
        super("elma");
        this.renk = renk;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
