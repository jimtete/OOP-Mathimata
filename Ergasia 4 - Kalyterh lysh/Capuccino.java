package ben_seferidis_erg5_klironomikotita;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benjaminseferidis
 */
public class Capuccino extends Coffee {

    
    private String gefsi;
    private int iced;
    private int kanella;
    
    public Capuccino(String gefsi,int iced,int kanella,String CoffeeName, int typosCafe, int Sweetness, int Dose, double price, Cream cream, Sugar sugar) {
        super(CoffeeName, typosCafe, Sweetness, Dose, price, cream, sugar);
        this.gefsi=gefsi;
        this.iced=iced;
        this.kanella=kanella;
    }
    
    
    
    
    public String getGefsi() {
        return gefsi;
    }

    public String getIced() {
        if(this.iced==1)return " kryos ";
        return " zestos ";
    }

    public String getKanella() {
        if(this.kanella==1)return " nai ";
        return " oxi ";
    }
}
