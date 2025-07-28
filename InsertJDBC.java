import java.sql.*;  // Import JDBC classes

public class InsertJDBC {
    public static void main(String[] args) {
        // Step 1: Database connection details
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "Khalid@786";

        // Step 2: Correct SQL query syntax
        String query = "INSERT INTO employees(id, name, job_title, address, salary) VALUES (4, 'Khalid', 'software eng', 'Pune', 5000000)";

        try {
            // Step 3: Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver loaded successfully");

            // Step 4: Establish connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");

            // Step 5: Create statement object
            Statement stmt = con.createStatement();

            // Step 6: Execute insert query
            int rowAffected = stmt.executeUpdate(query); // Execute the INSERT query

            if (rowAffected > 0) {
                System.out.println("Insert successful. " + rowAffected + " row(s) affected.");
            } else {
                System.out.println("Insertion failed.");
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
