import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime start = null;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        while (true) {
            System.out.println("\n--- Monitor czasu przy komputerze ---");
            System.out.println("1. Rozpocznij nową sesję");
            System.out.println("2. Zakończ sesję");
            System.out.println("3. Pokaż historię sesji");
            System.out.println("4. Wyjdź");
            System.out.print("Wybór: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    try {
                        if (start != null) {
                            throw new IllegalStateException("Sesja już trwa.");
                        }
                        start = LocalDateTime.now();
                        System.out.println("Sesja rozpoczęta: " + start.format(fmt));
                    } catch (IllegalStateException e) {
                        System.out.println("Błąd: " + e.getMessage());
                    } finally {
                        System.out.println("Operacja zakończona.");
                    }
                    break;

                case "2":
                    try {
                        if (start == null) {
                            throw new IllegalStateException("Nie rozpoczęto wcześniej sesji.");
                        }

                        LocalDateTime end = LocalDateTime.now();
                        long minutes = Duration.between(start, end).toMinutes();
                        String line = String.format("[%s] Sesja trwała: %d minut%n", start.format(fmt), minutes);

                        try (FileWriter fw = new FileWriter("sesje.txt", true)) {
                            fw.write(line);
                        }

                        System.out.println("Sesja zakończona: " + end.format(fmt) + " (trwała " + minutes + " minut)");
                        start = null;
                    } catch (IllegalStateException e) {
                        System.out.println("Błąd: " + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("Błąd zapisu do pliku: " + e.getMessage());
                    } finally {
                        System.out.println("Operacja zakończona.");
                    }
                    break;

                case "3":
                    try {
                        File f = new File("sesje.txt");
                        if (!f.exists()) {
                            f.createNewFile();
                            System.out.println("Brak zapisanych sesji.");
                        } else {
                            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                                String line;
                                boolean any = false;
                                while ((line = br.readLine()) != null) {
                                    System.out.println(line);
                                    any = true;
                                }
                                if (!any) {
                                    System.out.println("Brak zapisanych sesji.");
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Błąd odczytu pliku: " + e.getMessage());
                    } finally {
                        System.out.println("Operacja zakończona.");
                    }
                    break;

                case "4":
                    System.out.println("Do widzenia!");
                    scanner.close();
                    return;

                default:
                    try {
                        throw new IllegalArgumentException("Nieprawidłowy wybór menu.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Błąd: " + e.getMessage());
                    } finally {
                        System.out.println("Operacja zakończona.");
                    }
                    break;
            }
        }
    }
}