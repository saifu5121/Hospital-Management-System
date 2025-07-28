import java.sql.*;
public class UpdateJDBC {
    public static void main(String[] args) {

        // Connection Details

        String url="jdbc:mysql://localhost:3306/employees";
        String username ="root";
        String password ="Khalid@786";

        // query
        String query = "update employees set job_title = 'cloud Engineer', salary = 50000 where id = 4;";


        try{
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connect to DB
            Connection con =DriverManager.getConnection(url,username,password);
            System.out.println("driver loaded sucessfully");

            // Step 5: Creates a Statement object used to send SQL queries to the database.
            Statement stmt = con.createStatement();

            // Step 6: Execute updatet query n Returns the number of rows affected by the update and stores it in rowAffected.
            int rowAffected = stmt.executeUpdate(query); // Execute the INSERT query

            if (rowAffected > 0) {
                System.out.println("Updation successful. " + rowAffected + " row(s) affected.");
            } else {
                System.out.println("updation failed.");
            }

            // Step 7: Close resources Closes the Statement and Connection to free up database and memory resources.
            stmt.close();
            con.close();


        }
        catch (Exception e){
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
