public class maxVakue {
    private static String purity(String a){
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!='0') return a.substring(i);
        }
        return "";
    }
    private static String max(String k,String b){
        String t = purity(k);
        String s = purity(b);
        if(t.length()>s.length()) return t;
        else if (t.length()< s.length()) return s;
        else{
            for(int i = 0;i<t.length();i++){
                if(t.charAt(i)!=s.charAt(i)){
                    if(s.charAt(i)> t.charAt(i)) return s;
                    else return t;
                }
            }
            return s;
        }



    }
     public static void main(String[] args){
        String[] s = {"12345","123938","000000003","09234809","0100000000202020202020"};
        String maxi = s[0];
        for(int i = 1;i<s.length;i++){
           maxi =  max(maxi,s[i]);

        }
        System.out.println(maxi);
     }
}
