import java.util.Scanner;

public class Day50 {

    public static void main(String[] args) {
        Scanner wana = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        int bilangan = wana.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else if (bilangan % 3 == 0) {
            System.out.println(bilangan + " adalah bilangan ganjil yang habis di bagi 3.");
        } else {
            System.out.println("angka "+bilangan+" juga ganjil");
        }

    }

}
