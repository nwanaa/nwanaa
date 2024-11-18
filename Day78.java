import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jenis hewan yang kamu suka (kucing, hamster, alpaca): ");
        String hewan = input.nextLine();

        if (hewan.equalsIgnoreCase("kucing")) {
            System.out.println("kamu memilih kucing");
        } else if (hewan.equalsIgnoreCase("hamster")) {
            System.out.println("kamu memilih hamster");
        } else if (hewan.equalsIgnoreCase("alpaca")) {
            System.out.println("kamu memilih alpaca");
        } else {
            System.out.println("nda ada " + hewan);
        }

    }
}
