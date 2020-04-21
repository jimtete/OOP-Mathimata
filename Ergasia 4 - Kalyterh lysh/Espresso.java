package ben_seferidis_erg5_klironomikotita;

/**
 *
 * @author ben_seferidis
 */
public class Espresso extends Coffee {
    
    private String gefsi;
    private int iced;
    
    public Espresso(String gefsi,int iced,String CoffeeName, int typosCafe, int Sweetness, int Dose, double price, Cream cream, Sugar sugar) {
        super(CoffeeName, typosCafe, Sweetness, Dose, price, cream, sugar);
        this.gefsi=gefsi;
        this.iced=iced;
    }

    
    
    
    
    public String getGefsi() {
        return gefsi;
    }

    public String getIced() {
        if(this.iced==1)return " kryos ";
        return " zestos ";
    }
    
}
