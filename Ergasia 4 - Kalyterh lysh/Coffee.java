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
public class Coffee {
    
   private String CoffeeName; 
   private int typosCafe;
   private int Sweetness;
   private int Dose;
   private double price;
   private Cream cream;
   private Sugar sugar;

    public Coffee(String CoffeeName, int typosCafe, int Sweetness, int Dose, double price, Cream cream, Sugar sugar) {
        this.CoffeeName = CoffeeName;
        this.typosCafe = typosCafe;
        this.Sweetness = Sweetness;
        this.Dose = Dose;
        this.price = price;
        this.cream = cream;
        this.sugar = sugar;
    }

   

   
    public String getCoffeeName() {
        return CoffeeName;
    }

    public String getTypos_Cafe() {
        if(this.typosCafe==2) return "decaf";
        
            return "kanonikos";
    }

    public String getSweetness() {
        if(this.Sweetness==1) return "glykos";
        if (this.Sweetness==2) return "metrios";
        
            return "sketos";
    }

    public String getDose() {
        if(this.Dose==1)return "monos";
        return "diplos";
    }

    public double getPrice() {
        return price;
    }

    public Cream getCream() {
        return cream;
    }

    public Sugar getSugar() {
        return sugar;
    }
   
   
   
    
}
