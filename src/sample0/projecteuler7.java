package sample0;

public class projecteuler7 {
    static int count=0;

    public static void main(String[] args){
        int n=1;
        do{
            n++;
            if(checkforprime(n)){
                count++;

            }

        }while(count!=10001);
        System.out.println(n);
    }

    private static boolean checkforprime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
