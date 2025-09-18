public class power {
    private static long  pw(int num, int pow){
       if(pow == 0) return 1;

       long  ans =  pw(num,pow/2);
       if(pow%2 ==0) {
        return ans*ans;
        }else{
        return ans*ans*num;}
        
    }
    public static void main(String[] args){
        
        System.err.println(pw(2,31));
    }
    
}
