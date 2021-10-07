package sample0;

public class projecteuler6 {
    public static void main(String[] args ){
        int n=100;
        int squaresum,sumsquare;
//        for(int i=1;i<=n;i++){
//            squaresum+=i*i;
//            sumsquare+=i;
//        }
//        System.out.println((sumsquare*sumsquare)-squaresum);
        sumsquare=(n*(n+1))/2;
        squaresum=(n*(n+1)*(2*n+1))/6;
        System.out.println((sumsquare*sumsquare)-squaresum);

    }
}
