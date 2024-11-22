import java.util.Scanner;
public class ModifTotalKeseluruhan {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHargaKeseluruhan = 0;
        String kodePromo = "";
        System.out.print("Masukkan kode promo: ");
        sc.nextLine(); 
        kodePromo = sc.nextLine();

        while (true) {
            System.out.println("==== MENU RESTO CAFE ====");
            System.out.println("1. Kopi Hitam : Rp 15.000");
            System.out.println("2. Cappucino : Rp 20.000");
            System.out.println("3. Latte : Rp 22.000");
            System.out.println("4. Tea Tarick : Rp 12.000");
            System.out.println("5. Roti Bakar : Rp 10.000");
            System.out.println("6. Mie Goreng : Rp 18.000");
            System.out.println("7. Selesai Pesan");

            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6), atau 7 untuk selesai: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 7) {
                break;
            }

            System.out.print("Masukkan jumlah yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            int hargaItem = hitungTotalHarga(pilihanMenu, banyakItem);
            totalHargaKeseluruhan += hargaItem;

            System.out.println("Harga untuk menu yang Anda pilih: Rp " + hargaItem);
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
            totalHargaKeseluruhan = (int) (totalHargaKeseluruhan * 0.5);  
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
            totalHargaKeseluruhan = (int) (totalHargaKeseluruhan * 0.7);  
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo yang Anda masukkan tidak valid.");
        }
        System.out.println("\nTotal harga untuk pesanan Anda: Rp " + totalHargaKeseluruhan);
    
}
}
