public class Day87 {

    public static void main(String[] args) {
        String prodi[] = {"informatika", "sipil", "pwk", "sistem informasi"};

        for (String w : prodi) {
            System.out.println(w);
        }
        prodi[0] = "hukum";
        System.out.println("\nisi array nya setelah index ke-0 di ubah: ");
        for (String w : prodi) {
            System.out.println(w);
        }
    }
}
