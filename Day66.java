import java.util.Scanner;

public class Day66 {

    public static void main(String[] args) {
        Scanner wana = new Scanner(System.in);

        System.out.print("masukkan sisi persegi: ");
        int sisi = wana.nextInt();

        System.out.println("pola persegi:");
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.print("\nmasukkan panjang untuk persegi panjang: ");
        int panjang = wana.nextInt();
        System.out.print("masukkan lebar untuk persegi panjang: ");
        int lebar = wana.nextInt();

        System.out.println("pola persegi panjang:");
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}