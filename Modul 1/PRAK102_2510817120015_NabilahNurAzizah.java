import java.util.Scanner;

public class PRAK102_2510817120015_NabilahNurAzizah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int angka = scanner.nextInt();

        System.out.print("Output: ");

        int count = 0;

        while (count <= 10) {
            int result;

            if (angka % 5 == 0) {
                result = (angka / 5) - 1;
            } else {
                result = angka;
            }

            System.out.print(result);

            if (count < 10) {
                System.out.print(", ");
            }

            angka++;
            count++;
        }

        scanner.close();
    }
}