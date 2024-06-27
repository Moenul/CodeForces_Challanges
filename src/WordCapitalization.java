import java.util.Scanner;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String lasts = String.valueOf(Character.toUpperCase(word.charAt(0)));
        String old = String.valueOf(word.charAt(0));
        
        String newText = word.replaceFirst(old, lasts);

        System.out.println(newText);
    }
}
