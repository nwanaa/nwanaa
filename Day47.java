import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("total belanja: Rp ");
        int belanja = input.nextInt();

        if (belanja > 100000) {
            System.out.println("selamat kamu dapat ultra");
        }

        System.out.println("makasii");

    }

}
