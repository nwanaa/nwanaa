import java.util.Scanner;

public class Day89 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = " " + input.nextLine();
        String hasil = "";

        for (int i = 0; i < kalimat.length(); i++) {
            char kar = kalimat.charAt(i);

            if (i > 0 && kalimat.charAt(i - 1) == ' ') {
                hasil += Character.toUpperCase(kar);
            } else {
                hasil += Character.toLowerCase(kar);
            }
        }
        System.out.println(hasil.trim());

    }

}
