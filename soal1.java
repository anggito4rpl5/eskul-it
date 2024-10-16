
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        String jawaban;
        int jumlah = 7;
        int tiket, total = 0;
        double ratarata;
        boolean status = false;

        Scanner soal  = new Scanner(System.in);
        System.out.println("Apakah anda ingin menghitung rata-rata tiket?  ( ya / tidak )");
        jawaban = soal.nextLine();
        if (jawaban.equalsIgnoreCase("ya")) {
            status = true;
        } else if (jawaban.equalsIgnoreCase("tidak")) {
            status = false;
            System.out.println("program kamu dimatikan");
            System.exit(0);
        } else {
            System.out.println("Pilihlan jawaban antara ya atau tidak.");
            System.exit(0);
        }

        for (int i = 1; i <= 7; i++) {
            System.out.println("masukkan total tiket hari ke-" + i + " = ");
            tiket = soal.nextInt();
            total += tiket;

        }
        ratarata = total / jumlah;
        System.out.println();
        System.out.println("____________________________");
        System.out.println("total tiket = " + total);
        System.out.println("rata-rata tiket yang dihitung = " + ratarata);
        System.out.println("____________________________");
        

}
}
