import java.util.*;

public class Solution {
        static List<String> list;
    public static String[] solution(String[] strings, int n) {
           list = Arrays.asList(strings);
           list.sort((o1, o2) -> {
            char c1 = o1.charAt(n);
            char c2 = o2.charAt(n);
            if(c1 == c2){
                return o1.compareTo(o2);
            }
            else{
                return Character.compare(c1, c2);
            }
           }); 
           return list.stream().toArray(String[]::new);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }
}

