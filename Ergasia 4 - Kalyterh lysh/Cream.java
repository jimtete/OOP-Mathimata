package ben_seferidis_erg5_klironomikotita;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ben_seferidis
 */
public class Cream {
    
    private int typosCre;
    
      public Cream(int typosCre) {
        this.typosCre = typosCre;
    }

    public String getTyposCre() {
        if(this.typosCre==0)return " xoris cream ";
        if(this.typosCre==1)return " afrogala ";
        if(this.typosCre==2)return " fitiki ";
         
        return "gala";
    }
    
    
}
