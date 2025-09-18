import java.util.Scanner;
public class Multiplication {
    private static void input(int[][] arr,Scanner sc ){
        for(int i = 0 ; i< arr.length;i++){
            for(int j= 0; j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    } 
    private static void printeri(int[][] arr){
        for(int i = 0 ; i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }System.out.println();
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the row 1 of arraty=");
    int row_1 = sc.nextInt();
    System.out.print("enter the col 1 of array ");
    int col_1 = sc.nextInt();
    int[][] mat_1 = new int[row_1][col_1];
    System.out.println("enter the values = ");
    input(mat_1,sc);
    System.out.println("output = ");
    printeri(mat_1);
    System.out.print("enter the row 2 of arraty=");
    int row_2 = sc.nextInt();
    System.out.print("enter the col 2 of array ");
    int col_2 = sc.nextInt();
    int[][] mat_2 = new int[row_2][col_2];
    System.out.println("enter the values = ");
    input(mat_2,sc);
    System.out.println("output = ");
    printeri(mat_2);
    if(col_1==row_2){
        int[][] product = new int[row_1][col_2];
        for( int i = 0 ; i< row_1;i++){
            for(int j = 0 ; j<col_2;j++){
                for(int k = 0 ; k<col_1;k++){
                    product[i][j] += mat_1[i][k]*mat_2[k][j];
                }
            }
        }printeri(product);
    }else {
        System.out.print("not");
    }
    }
}
