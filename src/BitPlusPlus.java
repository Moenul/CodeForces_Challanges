import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        sc.nextLine();
        int result = 0;
        for (int i = 0; i < input; i++){
            String feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("x++") || feedback.equals("++x")){
                result += 1;
            }else if(feedback.equals("x--") || feedback.equals("--x")){
                result -= 1;
            }
        }
        System.out.println(result);

    }
}
