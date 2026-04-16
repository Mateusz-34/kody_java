import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ksiazka ksiazka = new Ksiazka();
        Czytelnik czytelnik = new Czytelnik();
        Biblioteka biblioteka = new Biblioteka();

        ksiazka.tytul = "Pan Tadeusz";
        ksiazka.autor = "Adam Mickiewicz";
        ksiazka.rokWydania = 1834;
        ksiazka.czyDostepne = true;

        ksiazka.tytul = "Potop";
        ksiazka.autor = "Henryk Sienkiewicz";
        ksiazka.rokWydania = 1886;
        ksiazka.czyDostepne = false;

        czytelnik.id = 1;
        czytelnik.imie = "Mateusz";
        czytelnik.nazwisko = "Ostróżka";

        czytelnik.id = 2;
        czytelnik.imie = "Eryk";
        czytelnik.nazwisko = "Nowak";

        boolean dzialanie = true;
        while (dzialanie){
            System.out.println("1. Dodaj ksiazke");
            System.out.println("2. Dodaj czytelnika");
            System.out.println("3. Wypożycz ksiazke");
            System.out.println("4. Oddaj ksiazke");
            System.out.println("5. Wyświetl ksiazke");
            System.out.println("6. Wyjście");
            System.out.print("Wybierz opcje: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Podaj tytul ksiazki: \n");
                    System.out.println("Podaj autora ksiazki: \n");
                    System.out.println("Podaj rok wydania ksiazki: \n");
                    break;
                case 2:
                    System.out.println("Podaj imie czytelnika: \n");
                    System.out.println("Podaj nazwisko czytelnika: \n");
                    break;
                case 3:
                    System.out.println("Wypozycz ksiazke: \n");
                    break;
                case 4:
                    System.out.println("Oddaj ksiazke: \n");
                    break;
                case 5:
                    System.out.println("\n Lista ksiazek: \n");
                    break;
                case 6:
                    dzialanie = false;
                    System.out.println("Koniec programu \n");
                    break;
                default:
                    System.out.println("Nieprawidlowa opcja \n");
            }
        }
    }
}
