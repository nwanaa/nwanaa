
 public class Day96 {

    public static void main(String[] args) {

        int w = 5;

        for (int i = 1; i <= w; i++) {
            for (int j = w; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = w - 1; i >= 1; i--) {
            for (int j = w; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
