import java.util.*;

public class subsetChecker {
    public static boolean checkeSubarray(int[] ar1, int[] ar2) {
        Set<Integer> hashSet = new HashSet<>();
        for (int n : ar1) {
            hashSet.add(n);
        }
        for (int n : ar2) {
            if (!hashSet.contains(n)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ar1 = { 11, 1, 13, 21, 3, 8, };
        int[] ar2 = { 11, 3, 5, 1 };
        if (checkeSubarray(ar1, ar2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
