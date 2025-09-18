import java.util.Scanner;

public class largest {
      public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the nbo of rows = ");
        int rows = sc.nextInt();
        System.out.print("enter the no of column = ");
        int column = sc.nextInt();
         int[][] matrix = new int[rows][column];
        System.out.print("enter the values  ");
        for(int i = 0; i<rows;i++){
          for(int j=0;j<column;j++){
              matrix[i][j]=sc.nextInt();
          }}
       //   int max = Integer.MIN_VALUE;
       int max = 0;
          for(int i = 0 ; i<rows;i++){
            for(int j= 0;j<column;j++){
              //  if(matrix[i][j]>max){
                 max= max+matrix[i][j];
                    // max = matrix[i][j];
          //      }
            }

          }
          System.out.print(max);
        sc.close();
        }

      }

