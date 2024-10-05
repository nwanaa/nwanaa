
import java.util.Scanner;

public class Day34 {
public static void main(String[] args) {
   Scanner w = new Scanner (System.in);
   
    System.out.print("nama: ");
    String nama = w.nextLine();
    
    System.out.print("nim: ");
    String nim = w.nextLine();
    
    System.out.print("umur: ");
    int umur = w.nextInt();
    w.nextLine();

    System.out.print("alamat: ");
    String alamat = w.nextLine();
    
    System.out.print("kelas: ");
    String kelas = w.nextLine();
    
    System.out.print("berat badan: ");
    float bb = w.nextFloat();
    
    System.out.print("tinggi badan: ");
    double tb = w.nextDouble();
    w.nextLine();
    
    System.out.print("pesan dan kesan: ");
    String pk = w.nextLine();
    
    System.out.print("motivasi: ");
    String motivasi = w.nextLine();
}
    
}
