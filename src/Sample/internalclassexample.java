package Sample;

public class internalclassexample {
    public void display(String name){
        System.out.println("hi "+name);
    }

    public static void main(String[] args){
        externalclass obj=new externalclass();
    }

public class internalcalss{
    public void display(String name){
        System.out.println("bye "+name);
    }
}

}

class externalclass extends internalclassexample{
    externalclass(){
        internalclassexample main=new internalclassexample();
        internalclassexample.internalcalss innerclass=main.new internalcalss();
        main.display("Eswar");
        innerclass.display("Eswar");

    }
}



