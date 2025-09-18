import java.util.Scanner;

public class Marks {
    public static int[] input(int a, Scanner sc){
        int[] array = new int[a];
        for(int i = 0; i<a;i++){
            array[i] = sc.nextInt();
          
        }return array;
    }
     public static void print(int[] arr){
        for(int i= 0; i<arr.length;i++ ){
            System.out.print(arr[i]);
         }
   }
     public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
     System.out.print("enter no of element = ");
     int size = sc.nextInt();
       int[] arr =input(size,sc);
       print(arr);
       System.out.println();
       for(int i = 0 ; i <size;i++){
        if(arr[i] <35) System.out.println(i + " fail");
       }
     } 
  
}
