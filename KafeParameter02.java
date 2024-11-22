import java.util.Scanner;
public class KafeParameter02 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamata datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk pembelian!");
        }
        System.out.println("==== MENU RESTO CAFE ====");
        System.out.println("1. Kopi Hitam : Rp 15.000");
        System.out.println("2. Cappucino : Rp 20.000");
        System.out.println("3. Latte : Rp 20.000");
        System.out.println("4. Tea Tarick : Rp 12.000");
        System.out.println("5. Roti Bakar : Rp 10.000");
        System.out.println("6. Mie Goreng : Rp 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih Menu yang Anda inginkan.");
    }
    public static void main(String[] args) {
        Menu("Andi", true);
    }
}
