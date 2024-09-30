import java.util.*;

public class unionHash {
       public static int union(int[] a ,int[] b){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<a.length;i++){
        set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
           return set.size();
       }
       
    public static void main(String[] args) {
        int ar1[] = { 6, 3, 9, 2, 4, 8, 4 };
        int ar2[] = { 7, 9, 5, 8 };
        System.out.println(union(ar1,ar2));

    }
}
