import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args ){
       Scanner sc = new Scanner(System.in);
        
       System.out.print("enter the no = ");
       int n = sc.nextInt();
        long k = 0;
        long power = 1;
       while (n>0){
           long parity = n%2;
           k+= parity*power;
           power*=10;
           n/=2;



           } System.out.println("your binary is = " +k);
       sc.close();
        }


    }

