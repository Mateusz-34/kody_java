import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj liczbę: ");
            int liczba = scanner.nextInt();

            if (liczba < 0) {
                throw new Ujemne("Liczba musi być dodatnia");
            }

            System.out.println("Podana liczba: " + liczba);

        } catch (Ujemne e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Musisz podać liczbę, a nie tekst.");
        }

        scanner.close();
    }
}