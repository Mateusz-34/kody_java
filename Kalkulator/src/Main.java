import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Wybierz działanie (1 - dodawanie,2 - odejmowanie,3 - mnożenie," +
                "4 - dzielenie,5 - potegowanie,6 - pierwiastkowanie," +
                "7 - historia,8 - czyszczenie,9 - wyjście): ");
        String op = sc.next();

        switch (op) {
            case "1" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + a + " + " + b + " = " + (a + b));

            }
            case "2" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + a + " - " + b + " = " + (a - b));
            }
            case "3" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + a + " * " + b + " = " + (a * b));
            }
            case "4" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = sc.nextInt();

                System.out.print("Podaj drugą liczbę: ");
                int b = sc.nextInt();

                try {
                    int wynik = a / b;
                    System.out.println("Wynik: " + a + " / " + b + " = " + wynik);
                } catch (ArithmeticException e) {
                    System.out.println("Błąd: nie można dzielić przez zero!");
                }
            }
            case "5" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + a + " ^ " + b + " = " + Math.pow(a, b));
            }
            case "6" -> {
                System.out.print("Podaj liczbę: ");
                double a = sc.nextDouble();

                try {
                    if (a < 0) {
                        throw new IllegalArgumentException("Nie można obliczyć √ z liczby < 0!");
                    }

                    System.out.println("Pierwiastek kwadratowy z " + a + " to: " + Math.sqrt(a));
                } catch (IllegalArgumentException e) {
                    System.out.println("Błąd: " + e.getMessage());
                }
            }

            case "7" -> System.out.println("Historia została wyczyszczona.");
            case "8" -> System.out.println("Czyszczenie: ");
            case "9" -> System.out.println("Koniec programu");
            default -> System.out.println("Nieznane działanie: " + op);
        }

        sc.close();
    }
}