import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {
        Scanner wana = new Scanner(System.in);

        int batas_awal = 0;
        int batas_akhir = 100;
        int bom = 29;
        int angka_tebakan = 101;

        while (angka_tebakan != bom) {
            System.out.print("masukkan angka " + batas_awal + " - " + batas_akhir + " : ");
            angka_tebakan = wana.nextInt();

            if (angka_tebakan < batas_awal || angka_tebakan > batas_akhir) {
                System.out.println("tidak boleh melebihi batas");

            } else {
                if (angka_tebakan < bom) {
                    batas_awal = angka_tebakan;
                } else if (angka_tebakan > bom) {
                    batas_akhir = angka_tebakan;
                } else if (angka_tebakan == bom) {
                    System.out.println("duarrrrrr");
                }

            }

        }

    }
}
