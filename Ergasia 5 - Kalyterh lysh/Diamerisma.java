package panagiotopouloseuaggelosask5;

public class Diamerisma extends Katoikia{
    private double timhD;

    public Diamerisma(double timhD, int kwdikos, int PlDwmatiwn, int tm, String dieuthunsh) {
        super(kwdikos, PlDwmatiwn, tm, dieuthunsh);
        this.timhD = timhD;
    }
    
    @Override
    public String poso(){
        if (this.getKwdikos()==1)return ("timh pwlhshs: "+timhD+1200);
        else return("trimh enoikiashs: "+timhD*1.5);       
    }
    
    @Override
    public String toString(){
        return ("Typos Synalaghs: "+this.typosSynalagis()+"\n"+"Plhthos Dwmatiwn: "+this.getPlDwmatiwn()+"\n"+"Tetragwnika MEtra: "+this.getTm()+"\n"+"Dieuthunsh: "+this.getDieuthunsh()
                +"\n"+this.poso()+"\n");
    }
}
