package vaggelis_erg2;

public class Vaggelis_erg2 {

    public static void main(String[] args) {
       int value = 3;
       int tmp = calcGinomeno(value); //to kanw me tmp giati alliw 8a exana egkefalika kyttara
       System.out.println(tmp);
       double tmp2=functionStOne(2);
       System.out.println(tmp2);
       boolean x;
       int ask2=6;
       x=isEven(ask2);
       System.out.println(x);
    }
    public static int calcGinomeno(int value){
        if(value==5) return 5;
        return value * calcGinomeno(value+2);
    }
    public static double functionStOne(int tmp){
        if (tmp==0)return 2;
        if (tmp==1)return 5;
        return functionStOne(tmp-1)*2 + functionStOne(tmp-2)/2;
    }
    public static boolean isEven(int ask2){        
            return isOdd(ask2-1);
    }
    public static boolean isOdd(int ask2){
        if(ask2==0)return true;
        if(ask2==1)return false;
        return isEven(ask2-1);
    }
}
