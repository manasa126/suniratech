package sample0;

public class Methodoverloading {
    String name,data,role;
    Methodoverloading(String name){
        this.name=name;
    }
    Methodoverloading(String data,String role){
        this.data=data;
        this.role=role;
    }
    public void display(String name){
        System.out.println("This is the name attribute :"+name);
    }
    public void display(String data,String role){
        System.out.println("This is the  attribute data,role :"+data+"  "+role);
    }

}
