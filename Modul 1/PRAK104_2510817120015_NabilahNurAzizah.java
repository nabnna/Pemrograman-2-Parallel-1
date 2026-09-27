import java.util.Scanner;

public class PRAK104_2510817120015_NabilahNurAzizah {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] tanganAbu = new String[3];
    String[] tanganBagas = new String[3];

    System.out.print("Tangan Abu: ");
    for (int i = 0; i < 3; i++) {
      tanganAbu[i] = scanner.next();
    }

    System.out.print("Tangan Bagas: ");
    for (int i = 0; i < 3; i++) {
      tanganBagas[i] = scanner.next();
    }

    int scoreAbu = 0;
    int scoreBagas = 0;

    for (int i = 0; i < 3; i++) {
      if (tanganAbu[i].equals(tanganBagas[i])) {
      }
      else if (tanganAbu[i].equals("B") && tanganBagas[i].equals("G") ||
              tanganAbu[i].equals("G") && tanganBagas[i].equals("K") ||
              tanganAbu[i].equals("K") && tanganBagas[i].equals("B")) {
        scoreAbu++;
      }
      else if (tanganBagas[i].equals("B") && tanganAbu[i].equals("G") ||
              tanganBagas[i].equals("G") && tanganAbu[i].equals("K") ||
              tanganBagas[i].equals("K") && tanganAbu[i].equals("B")) {
        scoreBagas++;
      }
    }

    System.out.print("Output: ");

    if (scoreAbu > scoreBagas) {
      System.out.print("Abu");
    } else if (scoreBagas > scoreAbu) {
      System.out.print("Bagas");
    } else {
      System.out.print("Seri");
    }

    scanner.close();
  }
}