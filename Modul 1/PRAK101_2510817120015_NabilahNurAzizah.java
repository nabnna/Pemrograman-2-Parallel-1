import java.util.Scanner;

class ValidasiKabisat {
    public boolean cekKabisat(int tahun) {
        boolean isKabisat = false;

        if (tahun % 400 == 0) {
            isKabisat = true;
        } else if (tahun % 100 != 0 && tahun % 4 == 0) {
            isKabisat = true;
        }

        return isKabisat;
    }
}

public class PRAK101_2510817120015_NabilahNurAzizah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double berat = scanner.nextDouble();

        ValidasiKabisat validasi = new ValidasiKabisat();
        boolean isKabisat = validasi.cekKabisat(tahun);

        if (bulan == 2) {
            if (isKabisat && tanggal > 29) {
                System.out.println("Error: Tahun kabisat, Februari maksimal 29 hari.");
                System.exit(0);
            } else if (!isKabisat && tanggal > 28) {
                System.out.println("Error: Bukan kabisat, Februari maksimal 28 hari.");
                System.exit(0);
            }
        }

        String monthName = "";
        if (bulan == 1) monthName = "Januari";
        else if (bulan == 2) monthName = "Februari";
        else if (bulan == 3) monthName = "Maret";
        else if (bulan == 4) monthName = "April";
        else if (bulan == 5) monthName = "Mei";
        else if (bulan == 6) monthName = "Juni";
        else if (bulan == 7) monthName = "Juli";
        else if (bulan == 8) monthName = "Agustus";
        else if (bulan == 9) monthName = "September";
        else if (bulan == 10) monthName = "Oktober";
        else if (bulan == 11) monthName = "November";
        else if (bulan == 12) monthName = "Desember";

        System.out.println("Output");
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggal + " " + monthName + " " + tahun);
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");

        scanner.close();
    }
}
