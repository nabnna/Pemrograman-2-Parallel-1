package PRAK401_2510817120015_NabilahNurAzizah;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String nama = input.nextLine();

        System.out.print("Ras: ");
        String ras = input.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(ras, nama);

        System.out.println("\n---Output---");
        hewan.display();

        input.close();
    }
}