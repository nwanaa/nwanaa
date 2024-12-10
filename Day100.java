import java.time.LocalTime;
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama: ");
        String nama = input.nextLine();

        LocalTime wasek = LocalTime.now();

        String salam;
        if (wasek.isBefore(LocalTime.NOON)) {
            salam = "selamat pagi";
        } else if (wasek.isBefore(LocalTime.of(17, 0))) {
            salam = "selamat siang";
        } else {
            salam = "selamat malam";
        }
        System.out.println("══════════════════════════════════════════");
        System.out.println(salam + ", " + nama);
        System.out.println("program anda telah selesai");
        System.out.println("══════════════════════════════════════════");
       

    }
}
