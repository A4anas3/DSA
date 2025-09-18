import java.util.Scanner;
public class SetEntireRowCol{
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      SetEntireRowCol st = new SetEntireRowCol();
      System.out.print("enter tghe no0 rowws");
      int row = sc.nextInt();
      System.out.print("col = ");
      int col = sc.nextInt();
      int[][] mat = new int[row][col];
      inpuit(mat, sc);
      st.print(mat);

    //  int[][] deepi = met_1(mat);
    //  st.print(deepi);
   // met_2(mat);
  //  st.print(mat);
    met_3(mat);
   st.print(mat);
   sc.close();
    }
    private static void inpuit(int[][] arr,Scanner t){
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0 ; j<arr[0].length;j++){
                arr[i][j]= t.nextInt();
            }
        }
    }
    private void print(int[][] arr){
        for(int i = 0 ; i<arr.length;i++){
             for(int j =0 ;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
             }System.out.println();
        }
    }
  //method 1
  private static int[][] met_1(int[][] arr){
     int[][] k= new int[arr.length][arr[0].length];
     for(int i = 0 ;i<arr.length;i++){
        for(int j = 0 ; j<arr[0].length;j++){
            k[i][j] = arr[i][j];
        }
     }
     for(int i = 0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==0){
                for(int l=0;l<arr.length;l++){
                    k[l][j]= 0;
                }
                for(int m =0 ; m<arr[0].length;m++){
                    k[i][m]=0;
                }
            }
        }
     }
       return k;
  }
// method 2
private static void met_2(int[][] arr ){
    int m = arr.length;
    int n = arr[0].length;
    boolean[] row = new boolean[m];
    boolean[] col= new boolean[n];
    for(int i=0;i<m;i++){
        for(int j = 0 ; j<n;j++){
            if(arr[i][j]==0){
                row[i]=true;
                col[j]=true;
            }
        }
    }
    for(int i = 0;i<m;i++){
        if(row[i]==true){
            for(int j = 0 ; j<n;j++){
                arr[i][j]=0;
            }
        }
    }
    for(int i = 0;i<m;i++){
        if(col[i]==true){
            for(int j = 0 ; j<n;j++){
                arr[j][i]=0;
            }
        }
    }
}
// Method 3
 private static void met_3(int [] [] arr){
    int i,j;
    int m=arr.length,n=arr[0].length;
    boolean zero_Row=false,zero_col=false;
    for(i = 0;i<m;i++){
        if(arr[i][0]==0){
            zero_col=true;
            break;
        }

    }
    for(i = 0;i<n;i++){
        if(arr[0][i]==0){
            zero_Row=true;
            break;
        }}
    
     for(i =1;i<m;i++){
        for(j=1;j<n;j++){
            if(arr[i][j]==0){
                arr[0][j]=0;
                arr[i][0]=0;

            }
        }
     }
     for( i = 1;i<m;i++){
        if(arr[i][0]==0){
           for(j=1;j<n;j++){
            arr[i][j]=0;
           }
        }
     }
     for( j=1;j<n;j++){
        if(arr[0][j]==0){
            for( i=1;i<m;i++){
                arr[i][j]=0;
            
        }
    }
}
 
 if(zero_Row){
    for(i = 0;i<n;i++){
        arr[0][i]=0;
    }
 }
 if(zero_col){
    for(i = 0;i<m;i++){
        arr[i][0]=0;
    }
 }
}
 }
