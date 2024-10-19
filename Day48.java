
import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        Scanner wana = new Scanner(System.in);

        System.out.print("nama: ");
        String nama = wana.nextLine();
        System.out.print("nilai: ");
        int nilai = wana.nextInt();

        if (nilai > 50) {
            System.out.println("selamat " + nama + ", kamu lulus tes");
        } else {
            System.out.println("maaf " + nama + ", kamu gagal");
        }

    }

}
