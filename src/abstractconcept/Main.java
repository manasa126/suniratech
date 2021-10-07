package abstractconcept;

public class Main extends newabstract implements newinterface{
    public static void main(String[] args){
        Main obj=new Main();
        obj.data();
        obj.value="data";
    }


    @Override
    void display1() {
        System.out.println("this is"+this.value);
    }

    @Override
    void display2() {
        System.out.println("this is"+this.value);
    }

    @Override
    void display3() {
        System.out.println("this is"+this.value);
    }

    @Override
    public void idisplay() {
    }

}
