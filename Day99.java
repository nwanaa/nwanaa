import java.util.Scanner;
public class Day99 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kalkulator sederhana");
        System.out.print("angka pertama : ");
        double angka1 = sc.nextDouble();
        System.out.print("angka kedua : ");
        double angka2 = sc.nextDouble();
        System.out.print("operator : ");
        char operator = sc.next().charAt(0);
        double hasil = 0;
        switch (operator) {
            case '+': {
                operator = '+';
                hasil = angka1 + angka2;
                break;
            }
            case '-': {
                operator = '-';
                hasil = angka1 - angka2;
                break;
            }
            case '%': {
                operator = '%';
                hasil = angka1 % angka2;
                break;
            }
            case '/': {
                operator = '/';
                hasil = angka1 / angka2;
                break;
            }
            case '*': {
                operator = '*';
                hasil = angka1 * angka2;
                break;
            }
            default: {
                System.out.println("error");
            }
        }
        System.out.println("\n" + angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
