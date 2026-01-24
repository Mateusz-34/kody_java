import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] rzutKostkami(int liczbaKostek) {
        Random random = new Random();
        int[] kostki = new int[liczbaKostek];

        for (int i = 0; i < liczbaKostek; i++) {
            kostki[i] = random.nextInt(6) + 1;
        }
        return kostki;
    }

    public static int obliczPunkty(int[] kostki) {
        int[] ileRazy = new int[7];

        for (int i = 0; i < kostki.length; i++) {
            ileRazy[kostki[i]]++;
        }

        int suma = 0;
        for (int i = 1; i <= 6; i++) {
            if (ileRazy[i] >= 2) {
                suma += i * ileRazy[i];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decyzja;

        do {
            int liczbaKostek;

            do {
                System.out.print("Podaj liczbę kostek (3 - 10): ");
                liczbaKostek = scanner.nextInt();
            } while (liczbaKostek < 3 || liczbaKostek > 10);

            int[] kostki = rzutKostkami(liczbaKostek);

            for (int i = 0; i < kostki.length; i++) {
                System.out.println("Kostka " + (i + 1) + ": " + kostki[i]);
            }

            int punkty = obliczPunkty(kostki);
            System.out.println("Liczba punktów: " + punkty);

            System.out.println("Czy chcesz zagrać ponownie? (t/n)");
            decyzja = scanner.next();

        } while (decyzja.equalsIgnoreCase("t"));

        scanner.close();
    }
}