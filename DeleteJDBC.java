import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJDBC {
    public static void main(String[] args) {
        // Step 1: Database connection details
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "Khalid@786";

        // Step 2: Correct SQL query syntax
        String query = "delete from employees where id =2;";

        try {
            // Step 3: Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver loaded successfully");

            // Step 4: Establish connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");

            // Step 5: Create statement object
            Statement stmt = con.createStatement();

            // Step 6: Execute delete query
            int rowAffected = stmt.executeUpdate(query); // Execute the delete query

            if (rowAffected > 0) {
                System.out.println("deletion successful. " + rowAffected + " row(s) affected.");
            } else {
                System.out.println("deletion failed.");
            }

            // Step 7: Close resources
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
    }

}
