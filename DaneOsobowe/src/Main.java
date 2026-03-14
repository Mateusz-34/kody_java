import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "osoby.txt";
        List<Osoba> people = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");

                String firstName = parts[0];
                String lastName = parts[1];
                int day = Integer.parseInt(parts[2]);
                int month = Integer.parseInt(parts[3]);
                int year = Integer.parseInt(parts[4]);
                String gender = parts[5];

                people.add(new Osoba(firstName, lastName, day, month, year, gender));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Osoba p : people) {
            System.out.println(p);
        }
    }
}
