package cyclesTasks;
import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a ; i++) {
            System.out.println(i + " : " + (i*i));

        }
    }
}
