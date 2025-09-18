public class subset {
    private static void subset(String s ,String b,int i){
        if(i==s.length()){
            System.out.println(b);
            return;
        }
        char c = s.charAt(i);
        subset(s, b+c, i+1);
        subset(s, b, i+1);
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
         String s = "Ana" ;
         subset(s,"",0);
 }}
    

