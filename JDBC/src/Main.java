import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/ksiazki";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM autorzy");

            while (rs.next()) {
                int id = rs.getInt("idAutora");
                String imie = rs.getString("imieAutora");
                String nazwisko = rs.getString("nazwiskoAutora");

                System.out.println(id + " - " + imie + " " + nazwisko);
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
