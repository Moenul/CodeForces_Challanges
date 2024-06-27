import java.util.Scanner;

public class ADominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();

        int b = m * n;
        int result = 0;
        while (b > 1){
            b = b - 2;
            result += 1;
        }
        System.out.println(result);
    }
}
