import java.util.Arrays;
import java.util.Scanner;

public class shallowCopy {
    private  static void print(int[] ar){
        for(int i = 0; i< ar.length ;i++){
            System.out.print(ar[i] + " ");
        } System.out.println();
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
      
        for(int i = 0; i<6;i++){
           arr[i] = sc.nextInt();
        }
        print(arr);
     //   int[] arr2 = arr.clone();
        int[] arr2 = Arrays.copyOfRange(arr,2,arr.length);
        print(arr2);
        arr[3]=10;
        print(arr);
        print(arr2);

     sc.close();
    }
    
}
