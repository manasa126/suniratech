package Sample;

public class submain {
   String data;

    public submain(String data) {

        this.data = data;

    }
    public void submaindisplay(Main obj){
        System.out.println("this data is from Main class"+obj.name);
        System.out.println("this data is from submain class"+this.data);
        display(obj);
    }

    private void display(Main obj){
        System.out.println("i am from submain display method"+obj.name);
    }
}
