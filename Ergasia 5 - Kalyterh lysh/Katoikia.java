package panagiotopouloseuaggelosask5;

public class Katoikia {
    private int kwdikos;
    private int PlDwmatiwn;
    private int tm;
    private String dieuthunsh;

    public Katoikia(int kwdikos, int PlDwmatiwn, int tm, String dieuthunsh) {
        this.kwdikos = kwdikos;
        this.PlDwmatiwn = PlDwmatiwn;
        this.tm = tm;
        this.dieuthunsh = dieuthunsh;
    }

    public int getPlDwmatiwn() {
        return PlDwmatiwn;
    }

    public int getTm() {
        return tm;
    }

    public String getDieuthunsh() {
        return dieuthunsh;
    }
    
    public int getKwdikos(){
        return this.kwdikos;
    }
    
    public String typosSynalagis(){
        String emfanisi;
        switch (kwdikos) {
            case 1:
                emfanisi="pwlhsh";
                break;
            default:
                emfanisi="enoikiash";
                break;
        }
        return emfanisi;
    }
    public String poso(){
        if (this.kwdikos==1)return("pwlhsh +1200");
        else return("enoikio * 1.5");       
    }
    
    public String toString(){
       return ("");
    }
}
