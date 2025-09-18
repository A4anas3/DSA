

public class Stringk{
    private static void print(String s,int a){
        if(a== (s.length())) return;
        System.out.print(s.charAt(a)+" ");
        print(s,a+1);
    }
    public static void main(String[] args){
       // Scanner sc = new Scanner(System.in);
        String s = "Anana os jgfh" ;
        print(s,0);
}}
