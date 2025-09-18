import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
       System.out.print("enter the no please");
       int a = obj.nextInt();
       int b = obj.nextInt();

    System.out.print("\nenter \"+\" to add , - to subtract * to multiply / to divide " );
     char c = obj.next().charAt(0);

     switch(c){
        case '+':
        System.out.println("a sum is " + (a+b));
          break;
        case '-':
        System.out.println("subtract " + (a-b));
        break;
        case '*':
        System.out.println("multiply " + (a*b));
          break;
        case '/':
        System.out.println(" divide " + (a/b));
        break;
        default :
        System.out.println(" wrong key enter ");
     }obj.close();
    }
}