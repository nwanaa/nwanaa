public class Day71 {

    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;

        int luas = hitungluas(panjang, lebar);
        System.out.println("luas persegi panjang: " + luas);
    }

    public static int hitungluas(int panjang, int lebar) {
        return panjang * lebar;
    }
}
