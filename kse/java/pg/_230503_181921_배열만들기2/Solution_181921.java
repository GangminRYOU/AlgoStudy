package java.pg._230503_181921_배열만들기2;
//https://school.programmers.co.kr/learn/courses/30/lessons/181921
//형변환 하지 말고 풀기
public class Solution_181921 {
    public int minFive(int l, int r){
        int numb = l;
        while(numb <= r){
            int temp = numb;
            int check = 1;
            while(temp>0){
                if(temp%10 != 0 && temp %10 !=5){
                    check = 0;
                    break;
                }
                temp = temp/10;
            }
            if(check == 1){
                return numb;
            }
            numb++;
        }
        return -1;
    }

    public int maxFive(int l, int r){
        int numb = r;
        while(numb > l){
            int temp = numb;
            int check = 1;
            while(temp>0){
                if(temp%10 != 0 && temp %10 !=5){
                    check = 0;
                    break;
                }
                temp = temp/10;
            }
            if(check == 1){
                return numb;
            }
            numb--;
        }
        return -1;
    }

    public int binaryChange(int numb){
        int temp = 0;
        int cnt = 0;
        while(numb >0){
            temp += ((numb%10)/5)*Math.pow(2,cnt);
            numb/=10;
            cnt +=1;
        }
        return temp;
    }

    public int[] solution(int l, int r) {
        int[] answer;
        int min = minFive(l,r); //가장 작은 05
        int max = maxFive(l,r); //가장 큰 05를 구해준다.
        //05가 1개도 없는 경우는 모든 문자열을 검사하게 된다.
        if(min==-1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            min = binaryChange(min);
            max = binaryChange(max);            //최대 최소를 2진수로 바꿔 주고
            answer = new int[max-min+1];        //그 사잇값만큼 answer를 초기화 해준다.
            for(int i = min ; i <= max ; i++){
                int temp = i;
                int cnt = 0;
                while(temp>0){
                    answer[i-min]+=((int)(temp%2*5*Math.pow(10,cnt)));
                    temp/=2;
                    cnt++;
                }
            }
        }
        return answer;
    }
}
