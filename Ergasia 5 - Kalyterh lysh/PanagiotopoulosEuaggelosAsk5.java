package panagiotopouloseuaggelosask5;

public class PanagiotopoulosEuaggelosAsk5 {

    public static void main(String[] args) {
        Katoikia deals[] = new Katoikia [5];
        deals[0]= new Diamerisma(300.0,2,3,16,"papanikou 35");
        deals[1]= new ExohikiKatoikia(20000.0,1,8,50,"no homo 19");
        deals[2]= new Diamerisma(250.0,2,2,20,"nai nia 57");
        deals[3]= new Mesonette(670.0,2,5,30,"lefta lefta 16");
        deals[4]= new Diamerisma(14000.0,1,4,27,"eukairia 84");
        
        for (int i=0;i<deals.length;i++){
            System.out.println(deals[i].toString());
        }
    }
    
}
