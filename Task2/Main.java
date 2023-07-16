import java.util.Scanner;




    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            int sum = addNumbers(num1, num2);
            int difference = subtractNumbers(num1, num2);
            int product = multiplyNumbers(num1, num2);
            double quotient = divideNumbers(num1, num2);

            System.out.println("Результат сложения: " + sum);
            System.out.println("Результат вычитания: " + difference);
            System.out.println("Результат умножения: " + product);
            System.out.println("Результат деления: " + quotient);
        }

        public static int addNumbers(int a, int b) {
            return a + b;
        }

        public static int subtractNumbers(int a, int b) {
            return a - b;
        }

        public static int multiplyNumbers(int a, int b) {
            return a * b;
        }

        public static double divideNumbers(int a, int b) {
            return (double) a / b;
        }
    }


