import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        int gaji, totalgaji=0, i=1;
        int jumlahkaryawan = 5;
        Scanner input = new Scanner(System.in);
        
        while (i<=jumlahkaryawan) {
        System.out.println("masukkan gaji karyawan ke-" + i + "");
        gaji = input.nextInt();
        i++;
        totalgaji += gaji;
            
        }
        System.out.println("total gaji 5 karyawan adalah  : " + totalgaji);
        }
    }
    

