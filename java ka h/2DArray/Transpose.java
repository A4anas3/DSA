//package 2DArray;
import java.util.Scanner;
public class Transpose {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value rows = ");
        int rows = sc.nextInt();
        System.out.print("enter the col = ");
        int col = sc.nextInt();
        int[][] matrix = new int[rows][col];
        System.out.print("enter the valuews = ");
        for(int i = 0 ; i< rows;i++){
            for(int j =0;j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

      int[][] transpose = new int[col][rows]; 
      for(int i = 0 ; i<rows;i++){
        for(int j= 0; j<col;j++){
            transpose[j][i]= matrix[i][j];
        }
      }
      for(int i = 0;i<col;i++){
        for(int j=0;j<rows;j++){
            System.out.print(transpose[i][j] + " ");
        }System.out.println();
      }
      sc.close();
    }
}
