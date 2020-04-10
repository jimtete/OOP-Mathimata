package euaggelospanagiotopoulos_ask3;

public class Employee {
    private String onoma;
    private String epwnumo;
    private long afm;
    private double misthos;
    
    Employee(String ONOMA,String EPWNUMO,long AFM,double MISTHOS){
        onoma=ONOMA;
        epwnumo=EPWNUMO;
        afm=AFM;
        misthos=MISTHOS;
    }
    
    public long getAfm(){
        return afm;
    }
    
    public String getEpwnumo(){
        return epwnumo;
    }
    public String toString(){
        return("onoma:"+onoma+" epwnumo:"+epwnumo+" afm:"+afm+" misthos:"+misthos);
    }
}
