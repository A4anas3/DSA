import java.util.Scanner;
import java.util.Arrays;
public class MaxOneIn2D {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the  no of row and col=");
       int rows = sc.nextInt();
       int cols = sc.nextInt();
       System.out.println("enter the values = ");
       int[][] mat = new int[rows][cols];
       input(mat, sc);
      // sort(mat);
       int row = 0;
       int mx = Integer.MIN_VALUE;
       for(int i = 0;i<mat.length;i++){
        
        max(mat[i]);
        if(  max(mat[i])>=mx){
            mx=  max(mat[i]);
            row = i;
        }
             
       }
       System.out.print("max row =" + (row+1));

      
    }
    public static void input(int[][] arr,Scanner sc){
        for(int i = 0 ; i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
  /*   public static void sort(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
    }
    public static int max(int[] arr){
       int lo =0,hi =arr.length-1;
       int k = arr.length;
    while(lo<=hi){
        int mid = lo + (hi - lo)/2;

        if(arr[mid]<1) lo= mid+1;
        else if (arr[mid]>=1){
            k=Math.min(mid, k);
         hi = mid-1;
        }
    }return k;*/
   // method 2
   public static int  max(int[] arr){
    int k = 0;
    for(int i = 0;i<arr.length;i++){
             if(arr[i]==1){
                k++;
             }
    }return k;
   }

}
