package euaggelospanagiotopoulos_ask3;

public class EuaggelosPanagiotopoulos_ask3 {


    public static void main(String[] args) {
        Employee temp;
        temp = new Employee("","",0,0.0);
        Employee employees[]= new Employee[4];
            employees[0]=new Employee ("Edgar","Wright",124221,50000.0);
            employees[1]=new Employee ("Euaggelos","Panagiotopoulos",174912,25000.0);
            employees[2]=new Employee ("Gewrgios","Papanikolaou",149257,32500.0);
            employees[3]=new Employee ("Alexandra","Papadopoulou",103217,18000.0);
            String EpwnumoAn="Wright";          
        if (MyUtils.AnazitisiMeEpwnumo(employees, EpwnumoAn)!= -1){
           
            System.out.println(employees[MyUtils.AnazitisiMeEpwnumo(employees,EpwnumoAn)].toString());
        }else{
            System.out.println("den uparxei to epwnumo:"+EpwnumoAn+" sthn lista");
        }
        
        for (int i=2;i<employees.length;i++){
            for(int j=employees.length;j>i;j--){
                if (employees[j-2].getAfm()>employees[j-1].getAfm()){
                    temp=employees[j-2];
                    employees[j-2]=employees[j-1];
                    employees[j-1]=temp;
                }
            }
        }
        int left=0;
        int right=employees.length;
        long AfmAn=103217;
        
        if(MyUtils.AnazitisiMeAfm(employees, left, right, AfmAn)!= -1){
            System.out.println(employees[MyUtils.AnazitisiMeAfm(employees, left, right, AfmAn)].toString());
        }else{
            System.out.println("den uparxei to afm:"+AfmAn+" sthn lista");
        }
           
    }
    
}
