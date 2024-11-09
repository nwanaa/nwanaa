
import java.util.Scanner;

public class Day69 {

    public static void main(String[] args) {
        //nomor 1
        Scanner wana = new Scanner(System.in);

        System.out.print("masukkan batas huruf: ");
        char batas = wana.next().charAt(0);

        System.out.print("masukkan huruf yang tidak ingin ditampilkan: ");
        char huruf = wana.next().charAt(0);

        for (char i = 'A'; i <= batas; i++) {
            if (i != huruf) {
                System.out.print(i + " ");
            }
        }

        //nomor 2
        //Scanner wana = new Scanner(System.in);
        int total = 0;

        for (;;) {
            System.out.print("masukkan angka: ");
            int angka = wana.nextInt();

            if (angka < 0) {
                angka *= -1;
            }
            if (angka == 0) {
                break;
            }
            total += angka;
        }
        System.out.println("total: " + total);

        //nomor 4
        //Scanner wana = new Scanner(System.in);
        System.out.print("masukkan angka awal: ");
        int awal = wana.nextInt();

        System.out.print("masukkan angka akhir: ");
        int akhir = wana.nextInt();

        int ganjil = 0;
        int genap = 0;

        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

        }
        System.out.println(ganjil);
        System.out.println(genap);

        //nomor 5
        //Scanner wana = new Scanner(System.in);
        int totall = 0;
        double jumlah = 0;
        for (;;) {
            System.out.print("masukkan nilai: ");
            int nilai = wana.nextInt();

            if (nilai > 0) {
                jumlah++;

            }
            if (nilai < 0) {
                break;
            }
            totall += nilai;

        }
        System.out.println("total nilai: " + totall);
        double rata = totall / jumlah;
        System.out.printf("rata %.2f", rata);

    }

}
