public class Day64 {

    public static void main(String[] args) {
        rorr:
        for (int i = 1; i < 30; i++) {
            System.out.println("i= " + i);
            if (i % 7 == 0) {
                System.out.println("break i = " + i);
                break rorr;
            }
        }
    }

}
