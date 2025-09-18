import java.util.Scanner;
public class move {
    public static void reversi(int[] arr,int i,int j){
        while(i<=j){
            int tem = arr[i];
            arr[i]= arr[j];
            arr[j]=tem; 
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size = ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("enter trhe step ");
        int k = sc.nextInt();
        k = k%n;
        for(int i = 0 ; i<n;i++){
            arr[i]= sc.nextInt(); }
        reversi(arr,0,n-1);
        reversi(arr,0, k-1);
        reversi(arr, k, n-1);
      
       
       /*   int[] ans = new int[n];
        int j =0;
        for(int i = n-k;i<n;i++){
            ans[j]= arr[i];
        j++;
    }
        for (int i = 0; i<n-k;i++){
            ans[j]= arr[i];
            j++;
        }*/ 

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
