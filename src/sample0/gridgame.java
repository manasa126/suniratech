package sample0;

import java.util.Scanner;

public class gridgame {
    String[][] data=new String[3][3];
    public void reset(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    data[i][j]="*";
            }
        }
    }
    private void display() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
    }
    gridgame(){
        int r=0,c=0;
        Scanner input=new Scanner(System.in);
        while(true){
            reset();
            try{
                data[r][c]="^";
            }
            catch(Exception e){
                System.out.println("system reset due to "+e);
                reset();
                r=0;
                c=0;
                data[r][c]="^";
            }
            display();
            System.out.println("Enter q to quit any other to continue");
            if(input.next().equals("q")){
                break;
            }
        System.out.println("u,d,r,l");
        String option=input.next();
            switch (option) {
                case "u" -> r--;
                case "d" -> r++;
                case "r" -> c++;
                case "l" -> c--;
                default -> System.out.println("invalid input");
            }


        }
    }



}
