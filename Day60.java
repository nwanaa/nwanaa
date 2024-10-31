public class Day60 {
public static void main(String[] args) {
        int w = 1;

        do {
            if (w % 5 == 0) {
                System.out.print(w + " ");
            }
            w++;
        } while (w <= 30);
    }
}
