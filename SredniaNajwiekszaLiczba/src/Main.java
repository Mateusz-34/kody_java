import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Wczytanie liczby elementów
        System.out.print("Ile liczb wylosować? ");
        int n = sc.nextInt();

        int sum = 0;
        int max = 0;

        System.out.print("Wylosowane liczby: ");
        for(int i = 0; i < n; i++) {
            int x = rand.nextInt(100) + 1; // losowa liczba 1-100
            System.out.print(x + " ");
            sum += x;
            if(x > max) {
                max = x;
            }
        }

        double average = (double) sum / n; // średnia arytmetyczna

        System.out.println("\nŚrednia = " + average);
        System.out.println("Największa liczba = " + max);
        sc.close();
    }
}