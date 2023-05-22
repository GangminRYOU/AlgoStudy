import java.util.*;
class Solution {
    public static String solution(String s) {
        char[] cArr = s.toCharArray();
        for (int i = 1; i < cArr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if(cArr[j] > cArr[j - 1]){
                    char tmp = cArr[j];
                    cArr[j] = cArr[j - 1];
                    cArr[j - 1] = tmp;
                }else{
                    break;
                }
            }
        }
        return new String(cArr);
    }
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
