import java.util.HashMap;

public class firstUniChar {
    public static int uniqueChar(String s){
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i= 0; i<s.length(); i++){
            char c = s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(m.get(c) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String abc = "leetcode";
        System.out.println(uniqueChar(abc));
    }
}