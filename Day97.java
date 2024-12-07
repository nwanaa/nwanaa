import java.util.Scanner;
public class Day97 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nilai n: ");
        int n = input.nextInt();

            for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            boolean prima = true;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
