package PRAK202_2510817120015_NabilahNurAzizah;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    // Setter
    public void setPembeli(String namaPembeli) {
        pembeli = namaPembeli;
    }

    // Getter
    public String getPembeli() {
        return pembeli;
    }

    public double getPajak() {
        double pajak = harga * 0.11;
        return pajak;
    }
}