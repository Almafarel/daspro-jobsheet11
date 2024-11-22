import java.util.Scanner;
public class MenuFungsi {
    static int HARI = 7; 
    static int MENU = 5; 
    static String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[MENU][HARI]; 
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);   
            inputPenjualan(sc);
            tampilkanPenjualan();
            menuPenjualanTertinggi(); 
            rataRataPenjualan();
    

        }    
        public static void inputPenjualan(Scanner scanner) {
            System.out.println("Masukkan data penjualan:");
            for (int i = 0; i < MENU; i++) {
                System.out.println("Menu: " + namaMenu[i]);
                for (int j = 0; j < HARI; j++) {
                    System.out.print("Hari ke-" + (j + 1) + ": ");
                    penjualan[i][j] = scanner.nextInt();
                }
            }
        }
        public static void tampilkanPenjualan() {
            System.out.println("\nData Penjualan:");
            System.out.print("Menu/Hari\t");
            for (int i = 1; i <= HARI; i++) {
                System.out.print("Hari " + i + "\t");
            }
            System.out.println();
    
            for (int i = 0; i < MENU; i++) {
                System.out.print(namaMenu[i] + "\t");
                for (int j = 0; j < HARI; j++) {
                    System.out.print(penjualan[i][j] + "\t");
                }
                System.out.println();
            }
        }    
        public static void menuPenjualanTertinggi() {
            int[] totalPenjualan = new int[MENU];
            for (int i = 0; i < MENU; i++) {
                for (int j = 0; j < HARI; j++) {
                    totalPenjualan[i] += penjualan[i][j];
                }
            }
            int maxIndex = 0;
            for (int i = 1; i < MENU; i++) {
                if (totalPenjualan[i] > totalPenjualan[maxIndex]) {
                    maxIndex = i;
                }
            }
    
            System.out.println("Menu dengan penjualan tertinggi adalah: " + namaMenu[maxIndex] +
                               " dengan total penjualan " + totalPenjualan[maxIndex]);
        }    
        public static void rataRataPenjualan() {
            System.out.println("Rata-rata penjualan setiap menu:");
            for (int i = 0; i < MENU; i++) {
                int total = 0;
                for (int j = 0; j < HARI; j++) {
                    total += penjualan[i][j];
                }
                double rataRata = (double) total / HARI;
                System.out.println(namaMenu[i] + ": " + String.format("%.2f", rataRata));
            }
        }
}
