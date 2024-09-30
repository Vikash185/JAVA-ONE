import java.util.*;

public class sumSubarray {
    public static void main(String[] args) {
        int arr[] = { 18, 2, -2, -20, 10 };
        int target = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0, sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - target)) { 
                ans += map.get(sum - target);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println("Number of subarrays: " + ans);
    }
}

