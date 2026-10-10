package PRAK303_2510817120015_NabilahNurAzizah;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ArrayList objek mahasiswa
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        HashMap<String, Mahasiswa> petaMahasiswa = new HashMap<>();

        int pilihan = -1;

        System.out.println("--- Output Program ---");

        while (pilihan != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");

            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                // CREATE
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = input.nextLine();

                Mahasiswa mhsBaru = new Mahasiswa(nama, nim);
                daftarMahasiswa.add(mhsBaru);
                petaMahasiswa.put(nim, mhsBaru);

                System.out.println("Mahasiswa " + nama + " ditambahkan.\n");

            } else if (pilihan == 2) {
                // DELETE
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = input.nextLine();

                boolean ketemu = false;
                for (int i = 0; i < daftarMahasiswa.size(); i++) {
                    if (daftarMahasiswa.get(i).getNim().equals(nimHapus)) {
                        daftarMahasiswa.remove(i);
                        petaMahasiswa.remove(nimHapus);
                        ketemu = true;
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                        break;
                    }
                }

                if (!ketemu) {
                    System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                }
                System.out.println();

            } else if (pilihan == 3) {
                // READ
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nimCari = input.nextLine();

                if (petaMahasiswa.containsKey(nimCari)) {
                    Mahasiswa mhs = petaMahasiswa.get(nimCari);
                    System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                } else {
                    System.out.println("Data mahasiswa tidak ditemukan.");
                }
                System.out.println();

            } else if (pilihan == 4) {
                // READ ALL
                System.out.println("Daftar Mahasiswa:");
                for (int i = 0; i < daftarMahasiswa.size(); i++) {
                    System.out.println("NIM: " + daftarMahasiswa.get(i).getNim() + ", Nama: " + daftarMahasiswa.get(i).getNama());
                }
                System.out.println();

            } else if (pilihan == 0) {
                daftarMahasiswa.clear();
                petaMahasiswa.clear();
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.\n");
            }
        }

        input.close();
    }
}