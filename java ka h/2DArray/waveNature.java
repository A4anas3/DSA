import java.util.Scanner;
public class waveNature {
    public static void main(String[] args ){
       Scanner sc = new Scanner(System.in);
      System.out.print("enter the no rows = ");
      int rows = sc.nextInt();
      System.out.print("enter the no col = ");
      int col = sc.nextInt();
      int[][] mat = new int[rows][col];
      System.out.print("enter the values = ");
      for(int i = 0 ; i<rows;i++){
        for(int j = 0 ; j<col ; j++){
            mat[i][j]= sc.nextInt();
        }
      }
    /*   for(int i = 0;i<rows;i++){
        for(int j = 0 ; j<col;j++){
            System.out.print(mat[i][j]+ " ");
        }System.out.println();
      }
      for(int i=0;i<rows;i++){
        if(i%2==0){
        for(int j=0;j<col;j++){
           System.out.print(mat[i][j] + " ");
        }
        }else{
            for(int j=col-1;j>=0;j--){
                System.out.print(mat[i][j] + " ");
        }
      }
    }
     1 2 3 
4 5 6
7 8 9
1 2 3 6 5 7 8 9
 */
/* for(int i = 0;i<rows;i++){
    for(int j = 0 ; j<col;j++){
        System.out.print(mat[i][j]+ " ");
    }System.out.println();
  }
  for(int i=0;i<rows;i++){
    if(i%2==0){
        for(int j=col-1;j>=0;j--){
       System.out.print(mat[i][j] + " ");
    }
    }else{
         for(int j=0;j<col;j++){
            System.out.print(mat[i][j] + " ");
    }
  }
}
  1 2 3 
4 5 6
7 8 9
3 2 1 4 5 6 9 8 7*/
/* for(int i = 0;i<rows;i++){
    for(int j = 0 ; j<col;j++){
        System.out.print(mat[i][j]+ " ");
    }System.out.println();
  }
  for(int i=0;i<rows;i++){
    if(i%2==0){
        for(int j=0;j<col;j++){
       System.out.print(mat[j][i] + " ");
    }
    }else{
           for(int j=col-1;j>=0;j--){
            System.out.print(mat[j][i] + " ");
    }
  }
}1 2 3 
4 5 6
7 8 9 
1 4 7 8 5 2 3 6 9 */

for(int i = 0;i<rows;i++){
    for(int j = 0 ; j<col;j++){
        System.out.print(mat[i][j]+ " ");
    }System.out.println();
  }
  for(int i=0;i<rows;i++){
    if(i%2==0){
        for(int j=col-1;j>=0;j--){
       System.out.print(mat[j][i] + " ");
    }
    }else{
         for(int j=0;j<col;j++){
            System.out.print(mat[j][i] + " ");
    }
  }
}sc.close();
}
}