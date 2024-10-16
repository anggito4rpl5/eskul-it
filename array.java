
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.println("Masukkan jumlah menu makanan " + "bentuk nominal ");
        int jumlah = array.nextInt();
        String makanan[] = new String[jumlah];
        int harga[]= new int [jumlah];

        for (int i = 0; i < makanan.length; i++) {
            System.out.println("menu " + (i+1) +   " = ");
            makanan[i]=array.next();
            System.out.println("harga"  + makanan [i]);
            harga[i]=array.nextInt();


            
        }
System.out.println("daftar menu ");
for (int i = 0  ; i < makanan.length; i++) {
    System.out.println(makanan[i]+": " + harga[i]);
}
   
array.close();
}
}


