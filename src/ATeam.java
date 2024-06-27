import java.util.Scanner;

public class ATeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int problems = sc.nextInt();

        int result = 0;

        for (int i = 0; i < problems; i++){
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();

            int feedback = petya + vasya + tonya;
            if (feedback >= 2){
                result += 1;
            }
        }
        System.out.println(result);

    }
}
