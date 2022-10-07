package cyclesTasks2;
import java.util.Scanner;

public class task2Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //generally 5 times
            for (int j = 0; j < i + 1; j++) {    //i+1 ==>  i = 0  i+1 = 1 *  |  i=1  i+1= 2 *
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
