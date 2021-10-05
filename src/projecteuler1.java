public class projecteuler1 {
    int result=0;
    projecteuler1(){
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0){
                //result+=result+i;
                result+=i;
            }
        }
        System.out.println(result);
    }

}
