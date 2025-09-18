import java.util.Scanner;
public class Reverse{
    public static void main(String[] args ){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the digit");
     int m = sc.nextInt();
     
     int reverse=0;
     int i = 0;
     int sum = 0;
     while(m>0){
        int s = m%10 ;
        reverse = reverse*10 +s;
        i++;
        sum = sum+ s;
        m/=10;
     }System.out.println("reverse "+ reverse);
     System.out.println("count " + i);
     System.out.println("sum " + sum);
    sc.close();
    }
}