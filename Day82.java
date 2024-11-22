import java.util.Scanner;

public class Day82 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka desimal: ");
        double angka = input.nextDouble();

        double ceil = Math.ceil(angka);
        System.out.println("\nhasil math.ceil: " + ceil);

        if (ceil > angka) {
            System.out.println("angka dibulatkan ke atas.");
        } else {
            System.out.println("angka tidak berubah karena sudah bulat ke atas.");
        }

        double floor = Math.floor(angka);
        System.out.println("\nhasil math.floor: " + floor);

        if (floor < angka) {
            System.out.println("angka dibulatkan ke bawah.");
        } else {
            System.out.println("angka tidak berubah karena sudah bulat ke bawah.");
        }

        long round = Math.round(angka);
        System.out.println("\nhasil math.round: " + round);

        if (round == (long) angka) {
            System.out.println("angka sudah bulat.");
        } else {
            System.out.println("angka dibulatkan ke bilangan terdekat.");
        }
    }
}
