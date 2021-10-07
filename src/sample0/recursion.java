package sample0;

public class recursion {
    public static void main(String[] args){
        int f=factorial(5);
        System.out.println("factorial value is "+f);
    }
    private static int factorial(int n) {
        if(n==0){ return 1;}
        else{ return n*factorial(n-1);}
    }
}
