package PRAK302_2510817120015_NabilahNurAzizah;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // HashMap daftar nama bulan
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        // LinkedList objek negara
        LinkedList<Negara> daftarNegara = new LinkedList<>();

        System.out.println("Input:");

        int jumlahNegara = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();

            // Cek jenis kepemimpinan
            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                Negara negaraBaru = new Negara(nama, jenisKepemimpinan, namaPemimpin);
                daftarNegara.add(negaraBaru);
            } else {
                int tanggal = input.nextInt();
                int bulan = input.nextInt();
                int tahun = input.nextInt();
                input.nextLine();

                Negara negaraBaru = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun);
                daftarNegara.add(negaraBaru);
            }
        }

        System.out.println("Output:");

        for (int i = 0; i < daftarNegara.size(); i++) {
            Negara negara = daftarNegara.get(i);
            String jenis = negara.getJenisKepemimpinan();
            String gelar = "";

            if (jenis.equalsIgnoreCase("presiden")) {
                gelar = "Presiden";
            } else if (jenis.equalsIgnoreCase("monarki")) {
                gelar = "Raja";
            } else if (jenis.equalsIgnoreCase("perdana menteri")) {
                gelar = "Perdana Menteri";
            }

            System.out.println("Negara " + negara.getNama() + " mempunyai " + gelar + " bernama " + negara.getNamaPemimpin());

            if (!jenis.equalsIgnoreCase("monarki")) {
                String bulanStr = namaBulan.get(negara.getBulan());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggal() + " " + bulanStr + " " + negara.getTahun());
            }

            System.out.println();
        }

        input.close();
    }
}