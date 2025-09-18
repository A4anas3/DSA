//Q10. Given an array of integers, change the value of all odd indexed elements to its second multiple and
// increment all even indexed values by 10.
import java.util.Scanner;
public class SecondMultiple {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
   System.out.print("please enter tyhe size = ");
        int size = sc.nextInt();
     int [] arr = new int[size];
    for(int i= 0 ; i<size;i++){
        arr[i]= sc.nextInt();
    }
    for(int i = 0; i<size;i++){
        if(i%2==0){
            arr[i]=arr[i]*2;
        }else{
            arr[i]=arr[i] + 10;
        }
    }
    for(int i= 0 ; i<size;i++){
        System.out.printf(" %d",arr[i]);
    }
}
}
