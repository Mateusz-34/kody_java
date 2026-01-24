import java.io.*;
import java.util.*;

public class Main {
    private static final String FILE_NAME = "numbers.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            int n = 0;
            while (n < 10) {
                System.out.print("Podaj ile liczb wygenerować (min. 10): ");
                try {
                    n = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    n = 0;
                }
            }
            generate(FILE_NAME, n);
        }

        while (true) {
            System.out.println("1. Sortuj liczby w pliku");
            System.out.println("2. Wyszukaj liczbę w pliku");
            System.out.println("3. Zakończ");
            System.out.print("Wybór: ");

            String choice = sc.nextLine();

            if (choice.equals("1")) {
                new NumberSorter(FILE_NAME).execute();
            } else if (choice.equals("2")) {
                System.out.print("Podaj liczbę: ");
                int x = Integer.parseInt(sc.nextLine());
                new NumberSearcher(FILE_NAME, x).execute();
            } else if (choice.equals("3")) {
                break;
            }
        }
        sc.close();
    }

    private static void generate(String fileName, int n) {
        Random r = new Random();
        try (PrintWriter pw = new PrintWriter(fileName)) {
            for (int i = 0; i < n; i++) {
                pw.println(r.nextInt(1000) + 1);
            }
        } catch (IOException e) {
        }
    }
}

abstract class FileOperation {
    protected String fileName;

    public FileOperation(String fileName) {
        this.fileName = fileName;
    }

    public abstract void execute();
}

class NumberSorter extends FileOperation {

    public NumberSorter(String fileName) {
        super(fileName);
    }

    @Override
    public void execute() {
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            return;
        }

        Collections.sort(list);

        try (PrintWriter pw = new PrintWriter(fileName)) {
            for (int n : list) {
                pw.println(n);
            }
        } catch (IOException e) {
        }

        System.out.println("Posortowano.");
    }
}

class NumberSearcher extends FileOperation {
    private int value;

    public NumberSearcher(String fileName, int value) {
        super(fileName);
        this.value = value;
    }

    @Override
    public void execute() {
        int count = 0;

        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextInt()) {
                if (sc.nextInt() == value) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            return;
        }

        if (count > 0)
            System.out.println("Liczba występuje " + count + " razy.");
        else
            System.out.println("Liczba nie występuje w pliku.");
    }
}