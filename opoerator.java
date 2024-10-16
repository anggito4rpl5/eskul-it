import java.util.Scanner;
public class opoerator {
    public static void main(String[] args) {
        Scanner anjay =  new Scanner(System.in);

        anjay = new Scanner(System.in);
   
        System.out.println("masukkan nilai a = ");
        int nilaiA = anjay.nextInt();
        System.out.println("masukkan nilai B  = ");
        int nilaiB = anjay.nextInt();

        boolean hasil = (nilaiA > nilaiB);

        System.out.println("maka nilai a adalah lebih besar dari nilai B" + hasil );
anjay.close();

        



    }
}
