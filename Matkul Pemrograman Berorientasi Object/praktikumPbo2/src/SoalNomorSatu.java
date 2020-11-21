import java.util.Scanner; // Import library scanner

public class SoalNomorSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        int kodePilihan = 0;
        double panjangBalok = 0;
        double lebarBalok = 0;
        double tinggiBalok = 0;
        double sisiKubus = 0;
        double tinggiTabung = 0;
        double jariJariTabung = 0;
        System.out.println("MENU");
        System.out.println("1. Volume Balok");
        System.out.println("2. Volume Kubus");
        System.out.println("3. Volume Tabung");
        System.out.print("Masukkan pilihan (1/2/3) : ");
        kodePilihan = input.nextInt();
        System.out.println("");
        switch (kodePilihan) {
            case 1:
                System.out.print("Input Panjang Balok : ");
                panjangBalok = input.nextDouble();
                System.out.print("Input Lebar Balok   : ");
                lebarBalok = input.nextDouble();
                System.out.print("Input Tinggi Balok  : ");
                tinggiBalok = input.nextDouble();
                System.out.println("Volume Balok = " + (panjangBalok*lebarBalok*tinggiBalok));
                break;
            case 2:
                System.out.print("Input Sisi Kubus : ");
                sisiKubus = input.nextDouble();
                System.out.println("Volume Kubus = " + (sisiKubus*sisiKubus*sisiKubus));
                break;
            case 3:
                System.out.print("Input Jari-Jari Alas Tabung : ");
                jariJariTabung = input.nextDouble();
                System.out.print("Input Tinggi Tabung         : ");
                tinggiTabung = input.nextDouble();
                System.out.println("Volume Tabung Adalah = " + (phi*jariJariTabung*jariJariTabung*tinggiTabung));
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }

    }
}