 import java.util.Scanner;
 // import java.util.Arrays;
 public class sortZero {
   public static void input(int[] arr,Scanner Sci){
    for(int i = 0; i<arr.length;i++){
        arr[i] = Sci.nextInt();
    }
   }
   public static void print(int[] arr){
    for(int i = 0; i<arr.length;i++){
    System.out.print(arr[i] + " ");
   }}
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        input(arr,sc);
   // built in    Arrays.sort(arr);
        print(arr);
        sc.close();
    }
 }