public class Hardest{
    public static void main(String[] args){
        int m = 4;
     /*    for(int i =1; i<=m;i++){
            for(int j = 1; j<=m-i;j++){
                System.out.print(" ");
            }
         for(int j = 1; j<= 2*i-1;j++){
            System.out.print("*");
         }System.out.println();   
        } 
        for(int i = 1;i<m;i++){
          for(int j = 1 ;j<=i;j++){
            System.out.print(" ");
        }
        
            for(int j = 1;j<=(2*(m-i)-1);j++){
            System.out.print("*");
        }System.out.println();
        }*/
        for(int i = 1; i<=m;i++){
            for(int j = 1; j<=m-i;j++){
             System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = i-1; j>=1;j--){
                System.out.print(j);
            }System.out.println();
        }
        for(int i =1 ; i<m;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=m-i;j++){
                System.out.print(j);
            }
            for(int j = m-i-1;j>=1;j--){
                System.out.print(j);
            }System.out.println();
        }
    }
}