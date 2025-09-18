public class Factorial{
    public static void main (String[] args){
        int m = 5;
        int fact = 1;
        if(m>0){
        for(int i  = 1;i<=m;i++){
            fact*=i;
        } System.out.print("factorial " + fact );}
        else{
            System.out.println("not possiblr ");
        }
           
    }
}