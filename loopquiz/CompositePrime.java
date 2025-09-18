public class CompositePrime{
    public static void main(String[] args){
       int n = 17;
        boolean x = false;

        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print("composite");
                x =true;
                break;
            }
          else  if(x==false){
                System.out.print("prime");
                break;
            }
        }
    }
}