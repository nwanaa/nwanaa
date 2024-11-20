import java.util.Scanner;

public class Day80 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah string yang ingin diproses: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("masukkan string ke-" + i + ": ");
            String text = input.nextLine();

            String nospa = text.trim();

            System.out.println("sebelum trim: '" + text + "'");
            System.out.println("setelah trim: '" + nospa + "'");

            String hasil = (nospa.isEmpty()) ? "string kosong setelah trim" : "string tidak kosong setelah trim";

            System.out.println(hasil);
        }

    }
}
