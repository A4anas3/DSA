import java.util.Scanner;

public class RollNoMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      System.out.print("enter the nbo of rows = ");
      int rows = sc.nextInt();
      System.out.print("enter the no of column = ");
      int column = sc.nextInt();
       int[][] matrix = new int[rows][column];
      System.out.print("enter the values first roll no then ");
      for(int i = 0; i<rows;i++){
        for(int j=0;j<column;j++){
            matrix[i][j]=sc.nextInt();
        }
      }
      for(int i = 0; i<rows;i++){
        for(int j= 0 ; j<column;j++){
            System.out.print(matrix[i][j] + " ");
        }System.out.println();
      }
      sc.close();
    }
}
