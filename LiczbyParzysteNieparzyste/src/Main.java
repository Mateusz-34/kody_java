import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Wczytanie liczby liczb do wylosowania
        System.out.print("Ile liczb wylosować? ");
        int n = sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < n; i++) {
            int number = rand.nextInt(10) + 1; // losuje liczby od 1 do 10
            System.out.print(number + " ");

            if (number % 2 == 0) {
                sumEven += number;  // suma liczb parzystych
            } else {
                sumOdd += number;   // suma liczb nieparzystych
            }
        }

        System.out.println(); // nowa linia
        System.out.println("Suma parzystych = " + sumEven);
        System.out.println("Suma nieparzystych = " + sumOdd);

        sc.close();
    }
}