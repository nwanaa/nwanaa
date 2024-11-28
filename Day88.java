import java.util.Scanner;

public class Day88 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama file: ");
        String file = input.nextLine();
        String format = "";
        boolean titik = false;

        for (int i = file.length() - 1; i >= 0; i--) {
            if (file.charAt(i) == '.') {
                titik = true;
                break;
            }
            format = file.charAt(i) + format;
        }

        System.out.println("format file adalah: " + format);

    }

}
