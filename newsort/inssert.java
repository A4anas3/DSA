package newsort;
import java.util.Scanner;
public class inssert {
    private static void inserti(int[] arr,int n){
        for(int i = 1; i<n;i++){
            for(int j = i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                     int temp = arr[j];
                     arr[j]= arr[j-1];
                     arr[j-1]= temp;
             
            }
                else break;
        }}
    }
    
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int[] arr = {5,4,3,2,1,-1};
        inserti(arr, 6);
        for(int i = 0; i<6;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
