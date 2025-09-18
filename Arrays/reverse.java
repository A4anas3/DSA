import java.util.Scanner;

public class reverse {
    public static void print(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }}
        public static void reversi(int[] arr){
            int j = arr.length-1;
            for(int i = 0; i<arr.length/2;i++){
                if(i+j == arr.length-1){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }j--;
            }
        }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size");
        int size = sc.nextInt();

        int [ ] arr = new int[size];
        for(int i = 0 ; i<size;i++){
            arr[i] = sc.nextInt();
        }

    /*     int start = 0, last = size-1;
        while(start<=last){
            int tem = arr[start];
            arr[start]= arr[last];
            arr[last] = tem;
            start++;
            last--;
        }*/
        reversi(arr);
        print(arr);
           sc.close();
    }
}
























































































































































































