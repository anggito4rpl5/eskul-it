
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        
        int barang = 0, total = 0;


        Scanner input = new Scanner(System.in);
        for (int i = 1; i <=5; i++) {
            System.out.println("Masukkan jumlah stok barang pada hari ke " + i);
            barang = input.nextInt();
            System.out.println("nama");
            total += barang;
            
        }
        System.out.println();
        System.out.println("Total stok pada semua hari terakhir adalah  = " + total);

    }
    
}
