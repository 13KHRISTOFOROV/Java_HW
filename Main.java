package homework;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        char ch = 'G';
        int num_0 = 89;
        byte num_1 = 4;
        short num_2 = 56;
        float num_3 = 4.7333436F;
        double num_4 = 4.355453532;
        long num_5 = 12121;

        System.out.println("Character: " + ch);
        System.out.println("Integer: " + num_0);
        System.out.println("Byte: " + num_1);
        System.out.println("Short: " + num_2);
        System.out.println("Float: " + num_3);
        System.out.println("Double: " + num_4);
        System.out.println("Long: " + num_5);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("___________________________");

        int number = 345;
        int firstNum = number / 100;
        int secNum = number / 100 / 10;
        int trNum = number % 10;

        System.out.println("Число " + number + " -> " + firstNum + "," + secNum + "," + trNum + ".");

       }
}
