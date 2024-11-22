public class Kubus02 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi; 
    }
    public static int hitungLuasPermukaan(int sisi) {
        return (sisi * sisi); 
    }
    public static void main(String[] args) {
        int sisiKubus = 9; 
        System.out.println("Sisi Kubus: " + sisiKubus);

        int volume = hitungVolume(sisiKubus);
        System.out.println("Volume Kubus: " + volume);

        int luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}

