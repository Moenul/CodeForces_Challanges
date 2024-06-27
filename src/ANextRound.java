import java.util.Scanner;

public class ANextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 0;

        int[] score = new int[n];

        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
            if (score[i] > 0 && score[i] >= score[k - 1] ){
                result += 1;
            }
        }
        System.out.println(result);
    }
}
