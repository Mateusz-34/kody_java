import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner czytajZpliku = new Scanner(new File("src/symbole.txt"));

        for (int i = 0; i < 2000; i++){
            String nazwa = czytajZpliku.nextLine();
            if (czyPalindrom(nazwa)){
                System.out.println(nazwa);
            }
        }
    }

    public static boolean czyPalindrom(String napis){
        int dlugoscNapisu = napis.length();

        for (int i = 0; i <= dlugoscNapisu/2; i++){
            if (napis.charAt(i) != napis.charAt(dlugoscNapisu - i - 1)){
                return false;
            }
        }
        return true;
    }
}