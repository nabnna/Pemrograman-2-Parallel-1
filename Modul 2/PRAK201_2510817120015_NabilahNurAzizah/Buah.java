package PRAK201_2510817120015_NabilahNurAzizah;

public class Buah {
    String namaBuah;
    double berat;
    double harga;
    double jumlahBeli;

    // Constructor
    public Buah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    // Method
    public void tampilkanInfo() {
        double hargaSebelumDiskon = (jumlahBeli / berat) * harga;
        double hargaPerKg = harga / berat;
        double hargaEmpatKg = hargaPerKg * 4;
        double diskonPerEmpatKg = hargaEmpatKg * 0.02;
        int kelipatan = (int) (jumlahBeli / 4);
        double totalDiskon = kelipatan * diskonPerEmpatKg;
        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        // Cetak Output
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", hargaSetelahDiskon);
        System.out.println();
    }
}