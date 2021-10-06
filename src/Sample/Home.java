package Sample;

public class Home extends Main {

    public Home(String name) {
        super(name);
    }

    public static void main(String[] args){
       Home obj1=new Home("Eswar1");
        Home obj2=new Home("Eswar2");
        Home obj3=new Home("Eswar3");

       obj1.display(obj3);
       obj3.submaindisplay(obj2);

    }

}
