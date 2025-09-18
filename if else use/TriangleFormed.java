import java.util.Scanner;

public class TriangleFormed{
    private static void check(int a,int b, int c ){
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("it form triangle");
        }else {
            System.out.println("notform");
        }
    }
    public static void main(String[] args ){
        Scanner obj  = new Scanner(System.in);
            System.out.print("enter the side  1");
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();
            check(a,b,c);
        }
    }
