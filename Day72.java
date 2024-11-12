import java.util.Scanner;

public class Day72 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int nilai = input.nextInt();
        print(nilai);
    }

    static void print(int w) {
        if (w > 0) {
            print(w - 1);
            System.out.print(w + " ");
        }
    }
}
