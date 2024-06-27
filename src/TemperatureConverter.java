import java.util.Scanner;


public class TemperatureConverter {
    public static void FahrenheitToCelsius(){
        Scanner sc = new Scanner(System.in);
        double c, f;

        System.out.print("Enter your Fahrenheit value : ");
        f = sc.nextDouble();
        c = (f - 32) * 5 / 9;
        System.out.println(f +"°F == "+ c + "°C ");
    }

    public static void CelsiusToFahrenheit(){
        Scanner sc = new Scanner(System.in);
        double c, f;

        System.out.print("Enter your Celsius value : ");
        c = sc.nextDouble();
        f = (c * 9/5) + 32;
        System.out.println(c +"°C == "+ f + "°F ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type C or F to confirm your current value: ");
        String input = sc.nextLine().toLowerCase();

        if (input.equals("c")){
            CelsiusToFahrenheit();
        }else if(input.equals("f")){
            FahrenheitToCelsius();
        }else{
            System.out.println("Wrong Input!! Enter correct input.");
        }
    }
}
