package sample0;

public class projecteuler12 {
    public static void main(String[] args){
        int n=1;
        int fc;
        int tn;
        do{
            tn=trianglesum(n);
            fc=factor(tn);
            n++;
        }while(!(fc>500));
        System.out.println(tn+" got " + fc+" factors");
    }
    private static int factor(int tn) {
        int count=0;
        for(int i=1;i<=(int) Math.sqrt(tn);i++){
            if(tn%i==0){
                count++;
            }
        }
        return count;
    }
    private static int trianglesum(int n) {
        int result=0;
        for(int i=1;i<=n;i++){
            result+=i;
        }
        return result;
    }
}
