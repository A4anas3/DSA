public class gretestAfter {
    public static void main (String[] args ){
    int [ ] a = {1,2,6,2,48,4,8};
    int n = a.length;
    int[] s = new int[n];
    s[0] = -1;
    int nge = a[0];
    for(int i = 1;i<n;i++){
          s[i]=nge;
          nge = Math.max(nge, a[i]);
    }
    for(int ele : s){
        System.out.print(ele + " ");
    }
    }

    }
