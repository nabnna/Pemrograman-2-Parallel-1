package PRAK203_2510817120015_NabilahNurAzizah;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena kurangnya titik koma (;) di akhir baris
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Pada bagian ini terjadi error karena umur belum diisi, jika tidak diisi maka umur otomatis bernilai 0
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini terjadi error karena format output tidak sesuai dengan yang diminta
        // Output meminta ada tambahan kata "tahun" di belakang angka umur
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}