import java.util.Scanner;
public class Day98 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nilai x: ");
        int x = input.nextInt();

        System.out.print("nilai y: ");
        int y = input.nextInt();

        int total = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("total penjumlahan bilangan genap dari " + x + " ke " + y + ": " + total);
    }

}
