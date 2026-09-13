import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.print("Choose num: ");
        int numMenu = scanner.nextInt();

        System.out.print("Input num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input num2: ");
        int num2 = scanner.nextInt();

        switch (numMenu) {
            case 1:
                System.out.println("Add: " + addNumber(num1, num2));
                break;
            case 2:
                System.out.println("Sub: " + subNumber(num1, num2));
                break;
            case 3:
                System.out.println("Mul: " + mulNumber(num1, num2));
                break;
            case 4:
                System.out.println("Div: " + divNumber(num1, num2));
                break;
        }

        scanner.close();

    }

    public static int addNumber(int num1, int num2) {
        return num1 + num2;
    }

    public static int subNumber(int num1, int num2) {
        return num1 - num2;
    }

    public static int mulNumber(int num1, int num2) {
        return num1 * num2;
    }

    public static float divNumber(float num1, float num2) {
        return num1 / num2;
    }
}