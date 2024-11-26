import java.util.Scanner;

public class Day86 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan panjang array: ");
        int panjangArray = input.nextInt();
        int nilai[] = new int[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("indeks ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }
    }

}
