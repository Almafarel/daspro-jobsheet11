import java.util.Scanner;
public class ModifKafeParameter {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon untuk pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON 50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50% untuk pembelian!");
        }if (kodePromo.equalsIgnoreCase("DISKON 30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30% untuk pembelian!");
        } else {
            System.out.println("Kode promo yang Anda masukkan tidak valid.");
        }

        System.out.println("==== MENU RESTO CAFE ====");
        System.out.println("1. Kopi Hitam : Rp 15.000");
        System.out.println("2. Cappucino : Rp 20.000");
        System.out.println("3. Latte : Rp 20.000");
        System.out.println("4. Tea Tarick : Rp 12.000");
        System.out.println("5. Roti Bakar : Rp 10.000");
        System.out.println("6. Mie Goreng : Rp 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Apakah Anda member? (true/false): ");
        boolean isMember = scanner.nextBoolean();
        System.out.print("Masukkan kode promo: ");
        scanner.nextLine(); 
        String kodePromo = scanner.nextLine();
        Menu(namaPelanggan, isMember, kodePromo);
}
}
