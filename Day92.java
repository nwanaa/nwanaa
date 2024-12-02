public class Day92 {
    public static void main(String[] args) {
        int w = 5;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w * 2 - 1; j++) {
                System.out.print((j == i || j == w * 2 - 2 - i) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
