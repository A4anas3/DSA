package exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
     int[] num = {1,20,30,4};
     int [] den= {1,2,0,3};
     for(int i =0;i<num.length;i++){
        System.out.println( divide(num[i] , den[i]));
     }
    }
    static  int divide(int i,int j){
        try {
            return i/j;
        } catch (ArithmeticException e) {
            System.err.println(e);
            return -1;
        }
    }
    
}
