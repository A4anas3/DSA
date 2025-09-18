
package newsort;
import java.util.Scanner;

public class BubbleSort {
    private static void BubbleSot(int[] arr){
        int l = arr.length;
        int count = 0;
        for(int i = 0 ; i <l-1;i++){
            boolean flag = true;
            for(int j = 0;j<l-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                
                    flag = false;
                }
                count++;
                
            }
            if(flag == true) break;
        }
        System.out.println(count);
    }
    private static void print(int[] arr,int l){
        for(int i = 0 ;i<l ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static int[] input(int l,Scanner sc){
        System.out.print("enterb tthe array");
        int[] arr = new int[l];
        for(int i= 0;i<l;i++){
            arr[i] = sc.nextInt(); 
            
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenghth");
        int l = sc.nextInt();
        int[] array = input(l, sc);
        print(array, l);
        BubbleSot(array);
        print(array,l);


    }
    
}
