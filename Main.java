import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        boolean isLeap = isLeapYear(year);
        System.out.println("Год " + year + " " + (isLeap ? "високосный" : "не високосный"));

        System.out.print("Введите три целых числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = findMax(num1, num2, num3);
        System.out.println("Максимум из трех чисел: " + max);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}