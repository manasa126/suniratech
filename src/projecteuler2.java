public class projecteuler2 {
    projecteuler2(){
        int f=1,s=2,r,result;
        result=s;
        while(true){
            r=f+s;
            f=s;
            s=r;
            if(r>4000000){
                System.out.println(result);
                break;
            }
            if(r%2==0){
                result+=r;
            }

        }
    }
}
