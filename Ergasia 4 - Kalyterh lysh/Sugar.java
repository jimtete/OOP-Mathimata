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
public class Sugar {
    private int typosSug;

    public Sugar(int typosSug) {
        this.typosSug = typosSug;
    }

    public String getTyposSug() {
        if(this.typosSug==1) return" white ";
        if(this.typosSug==2) return" brown ";
         return " lathos typos Sugar";
    }
    
    
}
