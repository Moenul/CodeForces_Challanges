import java.util.Scanner;

public class LongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i=0; i <= number; i++){
            String word = sc.nextLine().toLowerCase();

            int len = word.length();

            if(len > 10){
                char first = word.charAt(0);
                char last = word.charAt(len - 1);
                String output = len - 2 + "";
                System.out.println(first + output + last);
            }else{
                System.out.println(word);
            }
        }

    }
}
