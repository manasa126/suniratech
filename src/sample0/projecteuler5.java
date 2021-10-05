package sample0;

public class projecteuler5 {
    public boolean finder(int data){
        boolean result=true;
        for(int i=1;i<=20;i++){
            if(data%i!=0){
                result=false;
                break;
            }
        }
        return result;
    }
    projecteuler5(){
        int i=2;
        while(true){
            if(finder(i)){
                System.out.println(i);
                break;
            }
            i+=2;
        }
    }
}
