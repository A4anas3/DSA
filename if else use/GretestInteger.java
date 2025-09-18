 import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

 public class GretestInteger{
    public static void check(int a, int b, int c){
        if(a>b && a>c) System.out.println(" gretest " + a);
        else if(b>a && b> c) System.out.println("gretest is " + b);
        else System.out.println(" gretest is " + c);
        /* if(a>b){
            if(a>c){
                System.out.print("/n c a is greatest among all" + a);
            }else{
                System.out.print("\n c is greatest " + c);
            }
        }else {
            if(b>c){
                System.out.print("\n b is greatest " + b);
            }else{
                System.out.print("\n c is greatest =" + c);
            }
        } */
    }

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    while(true){
        System.out.print("\n enter 1st integer = ");
        int $first = scan.nextInt();
        System.out.print("\n enter the secind no = ");
        int second = scan.nextInt();
        System.out.print("enter the third no = ");
        int third = scan.nextInt();
         check($first,second,third);

         scan.nextLine();

         System.out.print("\n enter \"yes\" to run again ,or write \"no\" to stop ");
         String tell = scan.nextLine();

         if(tell.equals("yes")){
            System.out.println("next program started");
         }else{
           System.out.print("programn errort");
           break;
         }
    }scan.close();

}

 }