public class Main {
    public static void main(String[] args) {
        printStars(10);
        printStars(10);
        printStars(10);
        printStars(10);
        printStars(10);
    }

    private static void printStars(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append("*");
        }
        System.out.println(sb.toString());
    }
}