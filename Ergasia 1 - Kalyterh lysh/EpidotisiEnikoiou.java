package tiritidisgiorgos_erg1;


public class EpidotisiEnikoiou {
    private String name;
    private int status;
    private double income;
    private int members;

    public EpidotisiEnikoiou(String name, int status, double income, int members) {
        this.name = name;
        this.status = status;
        this.income = income;
        this.members = members;
    }
    
    
    public boolean Check(){
        if (income <= 3600 && members == 0)
            return true;
        else if (income<= 4200 && members ==1)
            return true;
        else if (income<=4800 && members == 2)
            return true;
        else if (income <= 6000 && members >= 3)
            return true;
        return false; 
        
    }

    public String getName() {
        return name;
    }
    
    }

