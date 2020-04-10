package euaggelospanagiotopoulos_ask3;

public class MyUtils {
    public static int AnazitisiMeEpwnumo(Employee employees[],String EpwnumoAn){
        int temp = -1;
        for (int i=0;i<employees.length;i++){
            if (EpwnumoAn.equals(employees[i].getEpwnumo())){
                temp=i;
            }
        }
        return temp;
    }
    
    public static int AnazitisiMeAfm(Employee arr[],int L,int R,long key){
        if (R<L)return -1;
        int mid=(R+L)/2;
        if (arr[mid].getAfm()==key) return mid;
        if (arr[mid].getAfm()>key){
            if (R==mid+1)return -1;
            return AnazitisiMeAfm(arr, L, mid-1, key);
        }
        if (arr[mid].getAfm()<key){
            if (mid-1==L)return -1;
            return AnazitisiMeAfm(arr, mid+1, R, key);
        }
        
        return 0;
    }
}
