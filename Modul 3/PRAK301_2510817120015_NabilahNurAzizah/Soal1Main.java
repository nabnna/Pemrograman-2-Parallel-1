package PRAK301_2510817120015_NabilahNurAzizah;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // LinkedList objek dadu
        LinkedList<Dadu> kumpulanDadu = new LinkedList<>();

        System.out.print("Input: ");
        int jumlahDadu = input.nextInt();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu daduBaru = new Dadu();
            kumpulanDadu.add(daduBaru);
        }

        int totalNilai = 0;

        System.out.println("Output:");

        for (int i = 0; i < kumpulanDadu.size(); i++) {
            int nilaiSekarang = kumpulanDadu.get(i).getNilai();

            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiSekarang);
            totalNilai = totalNilai + nilaiSekarang;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        input.close();
    }
}