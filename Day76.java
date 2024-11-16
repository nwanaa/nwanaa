import java.util.Scanner;

public class Day76 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan pilihan (mau / nda):");
        String text = input.nextLine();

        String cil = text.toUpperCase();

        switch (cil) {
            case "MAU":
                System.out.println("kamu memilih 'MAU'.");
                break;
            case "NDA":
                System.out.println("kamu memilih 'NDA'.");
                break;
            default:
                System.out.println("pilihan tidak dikenali.");
        }
    }
}
