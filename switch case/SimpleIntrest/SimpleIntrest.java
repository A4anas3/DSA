import java.util.Scanner;
public class SimpleIntrest{
    private float intrest(float a, float b,float t){
    float intrest = (a*b*t)/100;
return intrest;
    }
    public static void main(String[] args){
       while(true){
        SimpleIntrest obj = new SimpleIntrest();
        Scanner input = new Scanner(System.in) ;
        float principal,rate, time;
        System.out.print("Enter the principal amount = ");
        principal = input.nextFloat();
        System.out.print("Enter the intrest rate per anum = ");
        rate = input.nextFloat();
        System.out.print("Enter the no year = ");
        time = input.nextFloat();

        System.out.println("total amount = " + obj.intrest(principal,rate,time));
        input.nextLine(); 

        System.out.print("Enter \"yes\" to calculate again\n enter \"no\" to close the calculator");
        String tell;
        tell = input.nextLine();
        if(!tell.equalsIgnoreCase("yes")){
            input.close();
            break;
        }
    }
    
    }
}