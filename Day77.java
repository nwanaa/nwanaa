import java.util.Scanner;

public class Day77 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan kata pertama: ");
        String kata1 = input.nextLine();

        System.out.print("masukkan kata kedua: ");
        String kata2 = input.nextLine();

        String kata1cil = kata1.toLowerCase();
        String kata2cil = kata2.toLowerCase();

        if (kata1cil.equals(kata2cil)) {
            System.out.println("kedua kata tersebut sama");
        } else {
            System.out.println("kedua kata tersebut berbeda");
        }

    }
}
