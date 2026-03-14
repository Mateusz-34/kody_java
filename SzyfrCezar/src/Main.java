import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst do zaszyfrowania: ");
        String tekst = scanner.nextLine();

        System.out.print("Podaj klucz: ");
        int klucz = scanner.nextInt();

        Cezar szyfr = new Cezar(tekst, klucz);

        String wynik = szyfr.szyfruj();

        System.out.println("Zaszyfrowany tekst: " + wynik);

        scanner.close();
    }
}