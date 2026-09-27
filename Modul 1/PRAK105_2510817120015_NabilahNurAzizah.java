import java.util.Scanner;

public class PRAK105_2510817120015_NabilahNurAzizah {

    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jari-jari : ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi : ");
        double tinggi = scanner.nextDouble();

        double result = phi * radius * radius * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", radius, tinggi, result);

        scanner.close();
    }
}