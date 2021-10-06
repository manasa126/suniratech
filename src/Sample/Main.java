package Sample;

public class Main extends submain{
    String name;

    public Main(String name) {
        super(name);
        this.name = name;
    }
    public void display(Home obj){

        System.out.println("hi "+obj.name);
    }

}
