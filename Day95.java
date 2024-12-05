public class Day95 {
public static void main(String[] args) {
    int ti = 5;
        for (int i = 1; i <= ti; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------");
        for (int i = ti; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
