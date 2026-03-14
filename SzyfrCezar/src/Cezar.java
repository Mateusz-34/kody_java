/*
Autor: <Mateusz Ostróżka>
Klasa: Cezar
Opis: Implementacja algorytmu szyfru Cezara
Pola:
- tekstJawny – tekst wprowadzony przez użytkownika
- klucz – liczba przesunięcia w alfabecie
Metody:
- szyfruj() – zwraca zaszyfrowany tekst
*/

public class Cezar {

    private String tekstJawny;
    private int klucz;

    public Cezar(String tekstJawny, int klucz) {
        this.tekstJawny = tekstJawny;
        this.klucz = klucz;
    }

    public String szyfruj() {

        String wynik = "";

        for (int i = 0; i < tekstJawny.length(); i++) {

            char znak = tekstJawny.charAt(i);

            if (znak == ' ') {
                wynik += ' ';
                continue;
            }

            int kod = znak + klucz;

            while (kod > 'z') {
                kod -= 26;
            }

            while (kod < 'a') {
                kod += 26;
            }

            wynik += (char) kod;
        }

        return wynik;
    }
}