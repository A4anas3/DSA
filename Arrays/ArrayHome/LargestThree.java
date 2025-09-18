// Q7. WAP to find the largest three elements in the array.
import java.util.Scanner;
public class LargestThree {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the size = ");
     int size = sc.nextInt();
       System.out.print("enter the values = ");
       int[] obj= new int[size];
       for(int i = 0 ; i<size;i++){
        obj[i]=sc.nextInt();
       }
     // int thirdmax,smax,max = Integer.MIN_VALUE;
     int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE, thirdmax = Integer.MIN_VALUE;

       for(int i = 0 ; i<size;i++){
        if(obj[i]>=max){
            thirdmax = smax;
            smax = max;
            max= obj[i];
        }else if(obj[i]>smax && obj[i]<max){
            thirdmax =smax;
            smax = obj[i];
        }else if ( obj[i]>thirdmax && obj[i]<smax){
            thirdmax =obj[i];
        }
       }
       System.out.print("these are = " + max + " " + smax + " " + thirdmax);
       sc.close();
    }
}
