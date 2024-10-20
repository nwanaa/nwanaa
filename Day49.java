
import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {
        Scanner wana = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        int bilangan = wana.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else if (bilangan % 2 != 0) {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        } else {
            System.out.println("input tidak valid.");
        }

    }

}
