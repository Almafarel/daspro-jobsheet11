import java.util.Scanner;
public class hitungTotalHarga02 {
        public static int hitungTotalHarga(int pilihanMenu, int banyakItem, int hitungTotalHarga) {
            int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
            return hargaTotal;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }  
}
