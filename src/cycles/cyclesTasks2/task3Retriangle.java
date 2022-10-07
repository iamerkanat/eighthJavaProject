package cyclesTasks2;

public class task3Retriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
