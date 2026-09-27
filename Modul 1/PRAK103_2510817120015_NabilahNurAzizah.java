import java.util.Scanner;

public class PRAK103_2510817120015_NabilahNurAzizah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int n = scanner.nextInt();
        int start = scanner.nextInt();

        System.out.print("Output: ");

        int count = 0;
        int i = start;

        do {

            if (i % 2 != 0) {
                System.out.print(i);
                count++;

                if (count < n) {
                    System.out.print(", ");
                }
            }

            i++;
        } while (count < n);

        scanner.close();
    }
}