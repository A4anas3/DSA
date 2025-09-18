package newsort;
import java.util.Scanner;

public class Select {
    private static void Select(int[] arr ,int x){
        for(int i = 0;i<x-1;i++){
            int m = Integer.MIN_VALUE;
            int id = -1;
            for(int j=0;j<x-i;j++){
                 if(arr[j]>m){
                    m = arr[j];
                    id = j;
                 }
            }
            int temp = arr[x-i-1];
               arr[x-1-i]= arr[id];
               arr[id]= temp;
        }
    }
    private static void print(int[] arr, int l){
        for(int i = 0 ; i<l;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    private static int[] input (int x,Scanner sc){
        int[] arr = new int[x];
        for(int i = 0 ; i< x;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void  main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the size");
        int x = sc.nextInt();
        int[] arr = input(x, sc);
        Select(arr,x);
        print(arr, x);

    }
    
}
