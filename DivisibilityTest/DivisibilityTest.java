import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Divisibility test results:");

        for (int i = 0; i <= 9; i++) {
            if (number % i == 0) {
                System.out.printf("%d is divisible by %d\n", number, i);
            } else {
                System.out.printf("%d is not divisible by %d\n", number, i);
            }
        }
    }
}
