import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter binary no = ");
        int m = sc.nextInt();
        int power = 1;
        int deci = 0;
        while(m>0){
           int n= m%10;
            deci = deci + n*power;
            power*=2;
            m/=10;
        }System.out.print("decimalo is " + deci);
sc.close();
    }
    
}
