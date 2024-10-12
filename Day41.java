
import java.math.BigInteger;
import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        //nomor 1
        Scanner wana = new Scanner(System.in);

        System.out.print("angka1: ");
        BigInteger a = wana.nextBigInteger();
        System.out.print("angka2: ");
        BigInteger b = wana.nextBigInteger();

        System.out.println("tambah: " + a.add(b));
        System.out.println("kurang: " + a.subtract(b));
        System.out.println("kali: " + a.multiply(b));
        System.out.println("bagi: " + a.divide(b));
        System.out.println("----------");

        //nomor 2
        System.out.print("angka 1: ");
        String w1 = wana.nextLine();
        int w2 = Integer.parseInt(w1);
        System.out.print("angka2: ");
        String b1 = wana.nextLine();
        int b2 = Integer.parseInt(b1);
        System.out.println("hasil penjumlahan: " + (w2 + b2));
        
        //nomor 3
        int panjang = 6;
        int lebar = 5;
        
        System.out.println("keliling: " + 2 * (panjang + lebar));
        System.out.println("luas: " + panjang * lebar);
        
        //nomor 4
        int md = 37;
        int pl = 26;
        md = md + pl;
        pl = md - pl;
        md = md - pl;
        
        System.out.println("md: " + md);
        System.out.println("pl: " + pl);
    }

}
