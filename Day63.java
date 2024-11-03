public class Day63 {
public static void main(String[] args) {
        int i = 1;
        while (i < 29) {
            i++;
            if (i % 9 != 0) {
                continue; 
            }
            System.out.println(i);
        }
    }
}
