package cyclesTasks;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int amount = 0;
        while(true){   //finite cycle
            int a = scanner.nextInt();
            if (a == 0)
                break;
            sum += a; //sum = sum + a;
            amount++; //for count inputed numbers
        }
        System.out.println("sum: " + sum);
        System.out.println("amount: " + amount);
        System.out.println("average sum: " + (sum/amount));
    }
}
