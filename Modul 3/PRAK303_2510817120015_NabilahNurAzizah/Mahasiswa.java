package PRAK303_2510817120015_NabilahNurAzizah;

public class Mahasiswa {
    // Enkapsulasi
    private String nama;
    private String nim;

    // Konstruktor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter nim
    public String getNim() {
        return nim;
    }
}