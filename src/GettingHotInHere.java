import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        double number = scanner.nextDouble();

        double conv = (number - 32) * (5.0/9.0);
        System.out.printf("%.0f degrees Fahrenheit%n", number);
        System.out.printf("%.6f degrees Celsius\n", conv);
        System.out.printf("%.0f degrees Celsius\n", conv);
        System.out.printf("If it were 2 degrees Celsius warmer it would be %.6f degrees Celsius", (conv + 2));
    }
}
