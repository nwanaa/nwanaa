import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {
        Scanner wana = new Scanner(System.in);

        int angka_awal = wana.nextInt();

        while (true) {
            int angka = wana.nextInt();
            if (angka == angka_awal + 1) {
                angka_awal = angka;
            } else {
                System.out.println("angka tidak berurut");
                break;
            }
        }
    }

}
