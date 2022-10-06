package cyclesTasks;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0; //resultave
        for (int i = 0; i < b; i++) { // b = n; if a = 4; b = 5; it means: 4+4+4+4+4 (five times)
            sum += a; //sum=sum + a;

        }
        System.out.println("Result: " + sum);
    }
}
