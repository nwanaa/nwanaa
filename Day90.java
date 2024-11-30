import java.util.Scanner;

public class Day90 {
public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   
   int angka = input.nextInt();
   
    for (int i = 1; i <= angka; i++) {
        if (angka % i == 0){
            System.out.print(i + " ");
        }
    }
}
    
}
