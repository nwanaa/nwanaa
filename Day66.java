import java.util.Scanner;

public class Day66 {

    public static void main(String[] args) {
        Scanner wana = new Scanner(System.in);

        System.out.print("panjang: ");
        int panjang = wana.nextInt();

        System.out.print("lebar: ");
        int lebar = wana.nextInt();
        
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
