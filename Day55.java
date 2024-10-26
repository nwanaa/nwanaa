public class Day55 {

    public static void main(String[] args) {
        System.out.println("angka dari 50 sampai 1 yang habis dibagi 3:");

        for (int i = 50; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
