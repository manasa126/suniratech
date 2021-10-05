package sample0;

import java.util.Scanner;

public class threeda {
    String[][][] array=new String[2][2][2];
    public void adddata(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    System.out.println("Enter a value");
                   Scanner input=new Scanner(System.in);
                   array[i][j][k]=input.next();
                }
            }
        }
    }

    public void display(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){

                    System.out.print(array[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
