import java.util.Random;
import java.util.Scanner;

public class Totolotek {

    private int[] wprowadzoneliczby = new int[6];
    private int[]  wylosowaneliczby = new int[6];

    public void wprowadzLiczby(){
        Scanner scanner = new Scanner(System.in);
        int ile = 0;

        while (ile < 6){
            System.out.print("Podaj liczbe od 1 do 49: ");
            int liczba = scanner.nextInt();

            if (liczba < 1 || liczba > 49){
                System.out.println("Liczba spoza zakresu");
                continue;
            }
            boolean czyjest = false;

            for (int j = 0; j < ile; j++){
                if (wprowadzoneliczby[j] == liczba){
                    czyjest = true;
                    break;
                }
            }
            if (czyjest){
                wprowadzoneliczby[ile] = liczba;
                ile++;
            }
        }
    }

    public void wylosujLiczby(){
        Random random = new Random();
        int ile = 0;

        while (ile < 6){
            int liczba = random.nextInt(1,50);

            boolean czyjest = false;

            for (int j = 0; j < ile; j++){
                if (wylosowaneliczby[j] == liczba){
                    czyjest = true;
                    break;
                }
            }
            if (czyjest){
                wylosowaneliczby[ile] = liczba;
                ile++;
            }
        }
    }

    public void wypiszWprowadzone(){
        wypisz(wprowadzoneliczby);
    }

    public void wypiszWylosowane(){
        wypisz(wprowadzoneliczby);
    }

    private static void wypisz(int[] t){
        for (int i = 0; i < t.length; i++){
            System.out.print(t[i] + ", ");
        }
    }
}