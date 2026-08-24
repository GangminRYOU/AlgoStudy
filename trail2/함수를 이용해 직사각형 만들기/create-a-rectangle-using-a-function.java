import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        // Please write your code here.
        print(rowNum, colNum);
    }

    private static void print(int row, int col){
        for(int i = 0; i < row; i++){
            System.out.println(createRow(col));
        }
    }

    private static String createRow(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append("1");
        }
        return sb.toString();
    }
}

