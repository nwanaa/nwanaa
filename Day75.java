import java.util.Scanner;

public class Day75 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan pilihan (iya / nda):");
        String text = input.nextLine();
        
        
        String cil = text.toLowerCase();

        switch (cil) {
            case "iya":
                System.out.println("kamu memilih 'iya'.");
                break;
            case "nda":
                System.out.println("kamu memilih 'nda'.");
                break;
            default:
                System.out.println("pilihan tidak dikenali.");
        }
    }
}
