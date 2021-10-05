package sample0;

import java.util.Scanner;

public class projecteuler4 {
    public int reverse(int data){
        String temp="";
        String value= String.valueOf(data);
        for(int i= (value.length()-1);i>=0;i--){
//            temp=temp.concat(String.valueOf(value[i]));
            temp=temp+value.charAt(i);
        }

        return Integer.parseInt(temp);
    }
    projecteuler4(){

       int maxvalue=0;
        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                int option=i*j;
                if(option==reverse(option) && maxvalue<option){
                    maxvalue=option;
                }
            }
        }
        System.out.println(maxvalue);


    }
}
