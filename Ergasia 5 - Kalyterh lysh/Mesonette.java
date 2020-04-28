package panagiotopouloseuaggelosask5;

public class Mesonette extends Katoikia{
    private double timhM;

    public Mesonette(double timhM, int kwdikos, int PlDwmatiwn, int tm, String dieuthunsh) {
        super(kwdikos, PlDwmatiwn, tm, dieuthunsh);
        this.timhM = timhM;
    }
    
   @Override
    public String poso(){
        if (this.getKwdikos()==1)return ("timh pwlhshs: "+timhM+1200);
        else return("trimh enoikiashs: "+timhM*1.5);       
    }
    
    @Override
    public String toString(){
        return ("Typos Synalaghs: "+this.typosSynalagis()+"\n"+"Plhthos Dwmatiwn: "+this.getPlDwmatiwn()+"\n"+"Tetragwnika MEtra: "+this.getTm()+"\n"+"Dieuthunsh: "+this.getDieuthunsh()
                +"\n"+this.poso()+"\n");
    }
    
}
