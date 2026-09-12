import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba = 0;
        boolean poprawne = false;

        while (!poprawne) {
            System.out.print("Podaj liczbe calkowita: ");

            try {
                liczba = scanner.nextInt();
                poprawne = true;
            }catch (InputMismatchException e){
                System.out.println("Blad! Podana liczba to nie calkowita");
                scanner.next();
            }
        }
        System.out.println("Podana liczba calkowita: " + (liczba + 1));
        scanner.close();
    }
}
