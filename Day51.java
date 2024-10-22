//percabangan: switch case

public class Day51 {

    public static void main(String[] args) {
        int pilihan = 3;
        String hari;

        switch (pilihan) {
            case 1:
                hari = "senin";
                break;
            case 2:
                hari = "selasa";
                break;
            case 3:
                hari = "rabu";
                break;
            case 4:
                hari = "kamis";
                break;
            case 5:
                hari = "jumat";
                break;
            case 6:
                hari = "sabtu";
                break;
            case 7:
                hari = "minggu";
                break;
            default:
                hari = "hari tidak valid";
        }

       System.out.println(hari);

    }

}
