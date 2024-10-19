
import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("nama: ");
        String nama = scan.nextLine();
        System.out.print("nilai: ");
        int nilai = scan.nextInt();

        if (nilai > 50) {
            System.out.println("selamat " + nama + ", kamu lulus tes");
        } else {
            System.out.println("maaf " + nama + ", kamu gagal");
        }

    }

}
