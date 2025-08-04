import java.util.Scanner;

public class Task1 {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Java Calculator");

        while (running) {
            System.out.print("\nEnter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.println("Choose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int choice = input.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (yes/no): ");
            String again = input.next();

            if (!again.equalsIgnoreCase("yes")) {
                running = false;
                System.out.println("Goodbye!");
            }
        }

        input.close();
    }
}
