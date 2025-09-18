public class binaryy {
    private static void print(String s,int n){
        if(s.length()==n){
            System.err.println(s);
            return;
        }
             print(s+'0',n);
             print(s+1, n);
    }
    public static void main(String []args){
        int n  = 3;
        print("", n);

    }
    
}
