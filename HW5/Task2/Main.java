import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int open1 = 9;
        int open2 = 10;
        int close1 = 19;
        int close2 = 20;
        int open = Math.min(open1,open2);
        int close = Math.max(close1,close2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time: ");
        int time;
        while (true){
            time = sc.nextInt();
            if (time<0 || time>=24)
                System.out.print("Enter the valid value: ");
            else break;
        }
        if (time<open || time>close) System.out.println("Both shops are closed");
        else if (shop1Opened(time,open1,close1) && shop2Opened(time,open2,close2)) System.out.println("Both shops are opened");
        else if (shop1Opened(time,open1,close1)) System.out.println("Only the first shop is open");
        else System.out.println("Only the second shop is open");


    }
    public static boolean shop1Opened(int time,int open,int close){
        if (time>=open && time<close) return true;
        else return false;
    }
    public static boolean shop2Opened(int time,int open,int close){
        if (time>=open && time<close) return true;
        else return false;
    }

}