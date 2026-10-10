package PRAK301_2510817120015_NabilahNurAzizah;

import java.util.Random;

public class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    // Method
    public void acakNilai() {
        Random acak = new Random();
        this.nilai = acak.nextInt(6) + 1;
    }

    // Getter
    public int getNilai() {
        return this.nilai;
    }
}