package Trie;

class trie {
    trie[] t;
    boolean flag;

    trie() {
        t = new trie[26];

        flag = false;
    }

    void insert(String w){
        trie node=this;
        int n=w.length();
        for(int i=0;i<n;i++){
            int idx=w.charAt(i)-'a';
            if(node.t[idx]==null){
                node.t[idx]=new trie();
                

            }
            node=node.t[idx];
        }
        node.flag=true;
    }
    public boolean search(String w){
        
    }

}

public class TrieImpl {
 public static void main(String[] args) {
    trie a= new trie();
    a.insert("anas");
    
 }
}
