// not good method
import java.util.Scanner;
class Print{
    public void print(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
}
public class LinearSearch {
     private static boolean search(int[] arr2 ,Scanner obj){
        
       System.out.print(" enter the no please = ");
       int no = obj.nextInt();
       boolean  flag = false;
       for(int i = 0;i<arr2.length;i++){
        if(no ==arr2[i]){
            flag = true;
            break;
        }
       }if(flag == true) System.out.println(" yes ");
       else System.out.println("not");
       return false;
     }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Print sc = new Print();
        System.out.print("enter the lenth = " );
        int lengthe = obj.nextInt();
        int[] arr = new int[lengthe];
          
        for(int i = 0; i<lengthe;i++){
            arr[i]= obj.nextInt();
        }
        sc.print(arr);
         search(arr,obj);
         obj.close();
    }
}
