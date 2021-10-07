package sample0;

import java.util.ArrayList;

public class projecteuler3 {

    public static void main(String[] args){
        long n= 600851475143L;
        ArrayList<Integer> primenumbers=new ArrayList<>();
        for(long i=2;i<=n;i++){
            if(n%i==0){
                primenumbers.add((int) i);
                n=n/i;
            }
        }
        System.out.println(primenumbers);

    }
}
