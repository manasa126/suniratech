package Sample;
public class overriding {
    public static void main(String[] args){
        classa a=new classa();
        a.hai();
        classb b=new classb();
        b.hai();
    }
}
class classa{
    public void hai(){
        System.out.println("i am from class a");
    }
}
class classb extends classa{
    public void hai(){
        System.out.println("i am from class b");
    }
}
