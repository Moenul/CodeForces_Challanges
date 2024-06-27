import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) {
        String[] sc = new Scanner(System.in).next().split("\\+");
        Arrays.sort(sc);
        String result  = String.join("+", sc);
        System.out.println(result);
    }
}
