import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
    //  Числа от 1 до N
    public static void runTask1(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // Сумма чётных чисел
    public static void runTask2(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
    // Факториал
    public static void runTask3(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
    //Сумма цифр числа
    public static void runTask4(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int number = Math.abs(scanner.nextInt());
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println(sum);
        }
    }
    //Перевернуть число
    public static void runTask5(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int reversed = 0;
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            System.out.println(reversed);
        }
    }
    //Простое число
    public static void runTask6(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            boolean isPrime = n > 1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Простое");
            } else {
                System.out.println("Составное");
            }
        }
    }
}
