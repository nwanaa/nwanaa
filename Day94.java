public class Day94 {

    public static void main(String[] args) {
        int ti = 5;
        for (int i = 1; i <= ti; i++) {
            for (int j = 1; j <= ti - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
