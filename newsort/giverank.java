package newsort;
import java.util.Scanner;
public class giverank {
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
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.print("enter the value os size ");
        int l = sc.nextInt();
      int[] s =input(l, sc);
      int x=0;
      for(int i = 0 ; i<l;i++){
        int max = Integer.MAX_VALUE;
        int id = -1;
        for(int j = 0;j<l;j++){
            if(s[j]<max && s[j]>0){
                max=s[j];
                id = j;
            }
        }
        s[id]= x;
        x--;
      }
     for(int ele : s){
         ele*=-1;
    }
      print(s, l);
    }
    
}
