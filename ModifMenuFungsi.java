import java.util.Scanner;
public class ModifMenuFungsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scanner.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();

        String[] namaMenu = new String[jumlahMenu];
        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        inputPenjualan(scanner, namaMenu, penjualan, jumlahMenu, jumlahHari);

        tampilkanPenjualan(namaMenu, penjualan, jumlahMenu, jumlahHari);

        menuPenjualanTertinggi(namaMenu, penjualan, jumlahMenu, jumlahHari);

        rataRataPenjualan(namaMenu, penjualan, jumlahMenu, jumlahHari);

    }
    public static void inputPenjualan(Scanner scanner, String[] namaMenu, int[][] penjualan, int jumlahMenu, int jumlahHari) {
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = scanner.next();
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Penjualan " + namaMenu[i] + " pada hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }
    public static void tampilkanPenjualan(String[] namaMenu, int[][] penjualan, int jumlahMenu, int jumlahHari) {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(namaMenu[i] + ": ");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + (j == jumlahHari - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi(String[] namaMenu, int[][] penjualan, int jumlahMenu, int jumlahHari) {
        int maxPenjualan = 0;
        int maxIndex = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                maxIndex = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + namaMenu[maxIndex] +
                           " dengan total penjualan " + maxPenjualan);
    }
    public static void rataRataPenjualan(String[] namaMenu, int[][] penjualan, int jumlahMenu, int jumlahHari) {
        System.out.println("\nRata-rata penjualan setiap menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / jumlahHari;
            System.out.println(namaMenu[i] + ": " + String.format("%.2f", rataRata));
        }
    }
}