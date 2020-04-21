/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ben_seferidis_erg5_klironomikotita;

/**
 *
 * @author ben_seferidis
 */
public class Ben_Seferidis_Erg5_Klironomikotita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cream Cr = new Cream(0);
        Sugar Sug = new Sugar(2);
        Espresso Es = new Espresso("vanillia",1,"Espresso",1,2,2,3.5,Cr,Sug);
        

        System.out.println("Coffee name: " + Es.getCoffeeName()  );
        System.out.println("Typos cafe: " + Es.getTypos_Cafe()  );
        System.out.println("Sweetness: " + Es.getSweetness()  );
        System.out.println("Dosi: " + Es.getDose()  );
        System.out.println("Gefsi: " + Es.getGefsi()  );
        System.out.println("Iced: " + Es.getIced()  );
        System.out.println("TyposSug: " + Cr.getTyposCre()  );
        System.out.println("TyposCre: " + Sug.getTyposSug()  );
        System.out.println("Price: " + Es.getPrice() + " € " );
        
        
        
        // TODO code application logic here
    }
    
}
