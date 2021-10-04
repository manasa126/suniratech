import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        System.out.println("Enter your name");
        String name=input.next();

        System.out.println("enter your role");
        String role=input.next();

        System.out.println("give your experience details");
        
        int experience=input.nextInt();
        System.out.println(name + " "+ role + "  "+experience);
    }
}
