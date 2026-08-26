import java.util.*;
public class Solution {
    static Set<Integer> set = new HashSet<>();
    
    
    public static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j)
                    continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int i = 0;
        Iterator it = set.iterator();
        while(it.hasNext()){
            answer[i] = (Integer)it.next();
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1})));
    } 
}

