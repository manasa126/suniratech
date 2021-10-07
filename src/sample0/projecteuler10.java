package sample0;

public class projecteuler10 {
    public static void main(String[] args){
        int primesum=0;
        for(int i=2;i<2000000;i++){
        if(primechecker(i)){
            primesum+=i;
        }
        }
        System.out.println(primesum);
    }

    private static boolean primechecker(int n) {
        if(n==2){
            return true;
        }
        if (n%2==0 || n<2){
            return false;
        }

        for(int i=3;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
