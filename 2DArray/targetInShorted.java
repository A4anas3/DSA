import java.util.Scanner;
public class targetInShorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the no of rows = ");
        int row = sc.nextInt();
        System.out.print("enetr thge no col = ");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("enter the values o and 1 allowed only=");
       for(int i = 0; i<row;i++){
           for(int j = 0 ; j< col;j++){
               mat[i][j]= sc.nextInt();
           }

       }    System.out.println("ur");
       for(int i = 0 ; i<row;i++){
           for(int j=0  ;j<col;j++ ){
               System.out.print(mat[i][j] +" ");
           }System.out.println();
}
System.out.print("enter target");
int x = sc.nextInt();
    boolean found = shot(mat,x);
    if(found) System.out.print("yes it is in = ");
    else  System.out.print("no it is in = ");
    sc.close();
    }
    public static boolean shot(int[][] arr,int target){
        int i = 0,j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==target){
                return true;
                
                    
                   
            }else if(arr[i][j]>target){
                j--;
            }else{
                i++;
            }
        }return false;
    }
}
