package tiritidisgiorgos_erg1;


public class TiritidisGiorgos_erg1 {

    
          
    public static void main(String[] args) {
        int n = 4;
        EpidotisiEnikoiou ass[] = new EpidotisiEnikoiou [n];
        ass[0]= new EpidotisiEnikoiou("Kiklos Kikou", 1, 5000, 0);
        ass[1]= new EpidotisiEnikoiou("Nikos Nikas", 2, 4200, 2);
        ass[2]=new EpidotisiEnikoiou("Paulos Paulou", 2, 4100, 1);
        ass[3]=new EpidotisiEnikoiou("Vasilis Vasileiou", 2, 7000, 3);
    
       
       String Epilogi;
       for (int i=0; i < n ; i++){
           if (ass[i].Check() == true){
               Epilogi = "Epilegete";
           }else{
                Epilogi = "Den epilegete";
           }
           System.out.println(ass[i].getName()+ " "+ Epilogi);
       
       } 
      
    
    }
    
}
