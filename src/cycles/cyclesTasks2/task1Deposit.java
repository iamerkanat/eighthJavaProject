package cyclesTasks2;
import java.util.Scanner;
//sum of input
//srok
//percent 9%
// 100 000
// 3 years
// 1 year = 100 000 * 9% = 109 000
// 2 year = 109 000 * 9% = 118 210

public class task1Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert money: ");
        int money = scanner.nextInt();
        System.out.println("Insert time: ");
        int time = scanner.nextInt();

        for (int i = 0; i < time; i++) {
            money += money * 0.09;
            System.out.println("Money = " + (i + 1) + " = " + money);

        }
        System.out.println("Result: " + money);
    }
}
