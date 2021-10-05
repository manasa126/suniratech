import java.util.Scanner;
public class Main {
    //signup and signin using 2s arrays
    public static void signupandsignin2d(){
        String[][] users=new String[10][3];
        int index=0;
        Scanner input=new Scanner(System.in);
        while(true){
            if(index>9){
                System.out.println("terminating as memory limit reached");
                break;
            }

            System.out.println("enter s for signup any other for login");
            String option=input.next();
            if(option.equals("s")){
                String username,password ,data;
                System.out.println("Enter username");
                username=input.next();
                boolean flag=false;
                for(String[] user:users){
                    if(user[0] != null){
                        if(user[0].equals(username)){
                            flag=true;
                            break;
                        }
                    }
                }
                if(flag){
                    System.out.println("user already exist go for signin");
                }else{
                    System.out.println("Enter password");
                    password=input.next();
                    System.out.println("enter some data");
                    data=input.next();
                    users[index][0]=username;
                    users[index][1]=password;
                    users[index][2]=data;
                    index++;
                }




            }
            else{
                String username,password,data;
                System.out.println("Enter username");
                username=input.next();
                System.out.println("Enter password");
                password=input.next();
                boolean flag=true;
                for(String[] user:users){
                    if(username.equals(user[0])){
                        flag=false;
                        if(password.equals(user[1])){
                            System.out.println("data is :"+user[2]);
                        }
                        else{
                            System.out.println("wrong password");
                        }
                    }
                }
                if(flag){
                    System.out.println("user not found");
                }

            }
            System.out.println("Enter q to quit any other to continue");
            option=input.next();
            if(option.equals("q")){
                break;
            }


        }
    }

    public static void main(String[] args){
        //use this for 2d signup and signin
        //signupandsignin2d();
//        samplemethods obj1=new samplemethods();
//        obj1.data="data1";
//        samplemethods obj2=new samplemethods();
//        obj2.data="data2";
//        samplemethods obj3=new samplemethods();
//        obj3.data="data3";
//        obj1.display();

        //sample for 3d arrays
//        threeda thobj=new threeda();
//        thobj.adddata();
//        thobj.display();


        // for grid game
        // gridgame game=new gridgame();


// for project euler first problem
//        projecteuler1 problem1=new projecteuler1();

// for project euler 2nd problem
//        projecteuler2 problem2=new projecteuler2();

//// for project euler 4th problem
//        projecteuler4 problem4=new projecteuler4();

// for project euler 5th problem
        projecteuler5 problem5=new projecteuler5();












        //sample 2d string array
//        String[][] usercredentails={{"Eswar","Eswar123"},{"anjali","hai"}};
//
//        System.out.println(usercredentails[0][1]);
//
//        for(String[] user:usercredentails){
//            System.out.println("username :"+user[0] );
//            System.out.println("password :"+user[1] );
//        }


//simple signup and signin operation using arrays
//        String[] susername=new String[10];
//        String[] spassword=new String[10];
//        String username,password;
//        Scanner input=new Scanner(System.in);
//        int index=0;
//        while(true){
//            if(index>9){
//                System.out.println("you cant signup as limit reached ");
//                break;
//            }
//            System.out.println("enter s for signup l for login");
//            String option=input.next();
//            switch(option){
//                case "s":
//                    System.out.println("signup enter username and password");
//                    username=input.next();
//                    password=input.next();
//                    susername[index]=username;
//                    spassword[index]=password;
//                    index++;
//                    System.out.println("signup successful");
//                    break;
//                case "l":
//                    System.out.println("login enter username and password");
//                    username=input.next();
//                    password=input.next();
//                    boolean flag=true;
//                    int temindex=index;
//                    temindex--;
//                    for(int i=0;i<=(temindex);i++){
//                        if(susername[i].equals(username)){
//                            flag=false;
//                            if(spassword[i].equals(password)){
//                                System.out.println("login successful");
//                            }
//                            else{
//                                System.out.println("wrong password");
//                            }
//                        }
//                    }
//                    if(flag){
//                        System.out.println("user not found");
//                    }
//                    break;
//                default:
//                    System.out.println("invalid input");
//                    break;
//
//            }
//            System.out.println("enter q to quit any other to continue ");
//            option= input.next();
//            if(option.equals("q")){
//                System.out.println("end of code");
//                break;
//            }
//
//
//        }


//        int[] data=new int[10];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<10;i++){
//            data[i]=sc.nextInt();
//        }
//        for(int i:data){
//            System.out.println(i);
//        }



        //index out of bound exception at 9th index
//        int[] a={11,324,345,345,345,345,345,345};
//        for(int index=0;index<10;index++){
//            if(index==8){
//                continue;
//            }
//            System.out.println(a[index]);
//        }




//        String data="Eswar";
//        char[] data1=data.toCharArray();
//        System.out.println(data1[10]);



        // String handling and switch

//        String data;
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter data");
//        data=input.next();
//        System.out.println("Enter 1)length 2)uppercase 3)lowercase 4)find a value 5)concat ");
//        int option=input.nextInt();
//        switch(option){
//            case 1:
//                System.out.println(data.length());
//                break;
//            case 2:
//                System.out.println(data.toUpperCase());
//                break;
//            case 3:
//                System.out.println(data.toLowerCase());
//                break;
//            case 4:
//                System.out.println("Enter the character value you want to find");
//                String value=input.next();
//                System.out.println(data.indexOf(value));
//                break;
//            case 5:
//                System.out.println("enter the value your want to add");
//                String data1=input.next();
//                System.out.println(data+" "+data1);
//                break;
//            default:
//                System.out.println("invalid input");
//                break;
//
//        }








        //while
//        int i=0;
//        System.out.println(i);
//        i++;
//        while(i>0 && i<10){
//            System.out.println(i);
//            i++;
//        }




        //do while
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i>0 && i<10);




//                int a,b;
//        Scanner input=new Scanner(System.in);
/*
infinite loop in for
for(;;){

}
in while
while(){

}

*/
//        while(true){
//            System.out.println("enter a,b values");
//            a=input.nextInt();
//            b=input.nextInt();
//            System.out.println("Selct your option *,-,*,/,%");
//            String option=input.next();
//            if(option.equals("+")){
//                System.out.println("a+b is"+(a+b));
//            }else if(option.equals("-")){
//                System.out.println("a-b is"+(a-b));
//            }
//            else if(option.equals("*")){
//                System.out.println("a*b is"+(a*b));
//            }
//            else if(option.equals("/")){
//                System.out.println("a/b is"+(a/b));
//            }
//            else if(option.equals("%")){
//                System.out.println("a-b is"+(a%b));
//            }
//            else{
//                System.out.println("invalid input");
//            }
//            System.out.println("Enter q to quit or anyother to proceed");
//            option=input.next();
//            if(option.equals("q")){
//System.out.println("end of code");
//                break;
//            }
//
//        }















//        int i=1;
//        while(i<=5){
//            System.out.println(i);
//            i=i+2;
//        }
//        System.out.println(i);




//        int i;
//        for(i=1;i<=5;i=i+2){
//            System.out.println(i);
//        }
//        System.out.println(i);

        //        int a=13,b=2;
//
//        System.out.println("Selct your option *,-,*,/,%");
//        Scanner input=new Scanner(System.in);
//        String option=input.next();
//        if(option.equals("+")){
//            System.out.println("a+b is"+(a+b));
//        }else if(option.equals("-")){
//            System.out.println("a-b is"+(a-b));
//        }
//        else if(option.equals("*")){
//            System.out.println("a*b is"+(a*b));
//        }
//        else if(option.equals("/")){
//            System.out.println("a/b is"+(a/b));
//        }
//        else if(option.equals("%")){
//            System.out.println("a-b is"+(a%b));
//        }
//        else{
//            System.out.println("invalid input");
//        }











//               String dusername="root",dpassword="toor";
//
//        String username,password;
//
//        Scanner input=new Scanner(System.in);
//
//        System.out.println("Enter username:");
//        username=input.next();
//
//
//
//        if(username.equals(dusername)){
//            System.out.println("Enter password:");
//            password=input.next();
//            if(password.equals(dpassword)){
//                System.out.println("login successful");
//            }
//            else{
//                System.out.println("wrong password");
//            }
//        }
//        else{
//            System.out.println("user not found");
//        }










//         System.out.println("Enter your password");
//         password=input.next();
//
//         if(password.length()>=8){
//             System.out.println("password saved ");
//         }
//         else{
//             System.out.println("password should have atleast 8 characters ");
//         }



//        System.out.println("Enter your name");
//        String name=input.next();
//
//        System.out.println("enter your role");
//        String role=input.next();
//
//        System.out.println("give your experience details");
//
//        int experience=input.nextInt();
//        System.out.println(name + " "+ role + "  "+experience);
    }
}
