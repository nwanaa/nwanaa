public class Day58 {

    public static void main(String[] args) {
        short r = 30;

        while (r > 1) {
            r--;
            if (r % 2 != 0 && r % 3 == 0) {

                System.out.print(r + " ");
            }
        }
    }

}
