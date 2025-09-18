public class removeOccurence {
    private static void removeOf(String s,char a,int i,String ans){
        if(i== s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!=a) ans+=s.charAt(i);
        removeOf(s, a, i+1, ans);

    }
    public static void main(String[] args) {
        String s = "anas is good boy ";
        removeOf(s,'a', 0, "");
        
        
    }}
    

