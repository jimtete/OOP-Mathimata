package panagiotopouloseuaggelosask5;

public class ExohikiKatoikia extends Katoikia{
    private double timhEx;

    public ExohikiKatoikia(double timhEx, int kwdikos, int PlDwmatiwn, int tm, String dieuthunsh) {
        super(kwdikos, PlDwmatiwn, tm, dieuthunsh);
        this.timhEx = timhEx;
    }
    
    @Override
    public String poso(){
        if (this.getKwdikos()==1)return ("timh pwlhshs: "+timhEx+1200);
        else return("trimh enoikiashs: "+timhEx*1.5);       
    }
    
    @Override
    public String toString(){
        return ("Typos Synalaghs: "+this.typosSynalagis()+"\n"+"Plhthos Dwmatiwn: "+this.getPlDwmatiwn()+"\n"+"Tetragwnika MEtra: "+this.getTm()+"\n"+"Dieuthunsh: "+this.getDieuthunsh()
                +"\n"+this.poso()+"\n");
    }
    
}
