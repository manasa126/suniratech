package sample0;

import java.util.Scanner;

public class samplemethods {
    String data="root";
    public void greetings(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("hi "+input.next());

    }
    public void display(){
        System.out.println(data);
    }
}
