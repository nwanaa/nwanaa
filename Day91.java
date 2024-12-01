import java.util.Scanner;

public class Day91 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (;;) {
            int angka = input.nextInt();
            if (angka % 2 == 0) {
                System.out.println("genap");
            } else {
                System.out.println("you and i, end");
                break;
            }
        }
    }

}
