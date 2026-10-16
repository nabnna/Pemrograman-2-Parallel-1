package PRAK402_2510817120015_NabilahNurAzizah;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warna = input.nextLine();

            Kucing kucing = new Kucing(ras, nama, warna);

            System.out.println("\n---Output---");
            kucing.displayDetailKucing();

        } else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warna = input.nextLine();
            System.out.print("Kemampuan : ");
            String strKemampuan = input.nextLine();

            String[] arrKemampuan = strKemampuan.split(",");

            Anjing anjing = new Anjing(nama, ras, warna, arrKemampuan);

            System.out.println("\n---Output---");
            anjing.displayDetailAnjing();
        }

        input.close();
    }
}