package Sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Home extends Main {


    private static void createfile(String filename){
        File file=new File(filename);
        try {
            if(file.createNewFile()){
                System.out.println("file created ");
            }
            else{
                System.out.println("file already exist ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writetofile(String filename){
        Scanner input=new Scanner(System.in);
        try {
            FileWriter fwrite=new FileWriter(filename);
            System.out.println("Enter data ");
            fwrite.write(input.nextLine());
            fwrite.close();
            System.out.println("file updated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void readfromfile(String filename){
        File file=new File(filename);
        try {
            Scanner filereader=new Scanner(file);
            System.out.println("data:=====>:\n");
            while(filereader.hasNextLine()){
            String line=filereader.nextLine();
            System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Home(String name) {
        super(name);
    }

    public static void main(String[] args){
       Home obj1=new Home("i am obj1");
        Home obj2=new Home("i am obj2");
        Home obj3=new Home("i am obj 3");
       obj3.display(obj3);
       obj1.submaindisplay(obj3);
       System.out.println("\n\n\nencapsulation\n");
        // encapsulation
        String U="Eswar",P="Eswar",data="hi i am from bangalore";
        data odata=new data(U,P,data);
        odata.info();
        odata.setUsername("Eswar123");
        odata.setPassword("24332456rfdhgdfgfd");
        odata.info();
        System.out.println("\n\n\nfile handling\n");
        //file handling
        String filename="readme.txt";
        createfile(filename);
//        writetofile(filename);  //to write data to a file
        readfromfile(filename);
        Scanner input=new Scanner(System.in);

//        ArrayList<String> array=new ArrayList<>();
//        for(int i=0;i<5;i++){
//            System.out.print("enter data:");
//            array.add(input.nextLine());
//            System.out.println();
//        }
//        for(int i=0;i<array.size();i++){
//
//            System.out.println(array.get(i));
//        }





    }

}
