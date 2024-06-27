import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextLine().compareToIgnoreCase(sc.nextLine());
        int result = (c > 0) ? 1 : (c > -1 ? 0 : -1);
        System.out.println(result);
    }
}
