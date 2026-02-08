import java.sql.*;

public class PostgresTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1/mili";
        String user = "postgres";
        String password = "whitecat01";

        System.out.println("Testing connection to: " + url);
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded.");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT version()");
            if (rs.next()) {
                System.out.println("Database Version: " + rs.getString(1));
            }
            con.close();
            System.out.println("Test PASSED.");
        } catch (Exception e) {
            System.out.println("Test FAILED:");
            e.printStackTrace();
        }
    }
}
