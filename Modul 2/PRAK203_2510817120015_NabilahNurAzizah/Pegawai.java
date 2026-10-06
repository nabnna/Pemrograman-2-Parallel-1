package PRAK203_2510817120015_NabilahNurAzizah;

// Pada baris ini terjadi error karena nama class (Employee) tidak sama dengan nama file (Pegawai.java)
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena tipe data Char hanya bisa menyimpan karakter tunggal
    // Sedangkan asal seharusnya berisi teks panjang, maka tipe datanya harus diubah menjadi String
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method setJabatan tidak memiliki parameter
    // Padahal di file Main, method ini dipanggil dengan memasukkan teks "Assasin", sehingga perlu parameter String
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}