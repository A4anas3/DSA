public class MergeTwoSortedArray {
    public static void main(String [] args){
    int[] a = {1,2,3,4,7};
    int[] b = {7,9,10,12,13};
    int m= a.length;
    int n = b.length;
   int[] s = new int[m+n];
  int i = 0,j= 0,k=0;
   while(i<m  && j<n){
    if(a[i]<=b[j]){
       s[k]= a[i];
       i++;
    }
    else{
        s[k]=b[j];
        j++;
    }k++;
   }
   if(i==m){
    while(j<n){
        s[k]=b[j];
        j++;
        k++;
    }
   }
   if(j==n){
    while(i<m){
        s[k]=a[i];
        i++;
        k++;
    }
   }
    for(k = 0; k<(m+n);k++){
        System.out.print(s[k] + " ");
    }
}
}
