import java.sql.*;
import java.text.DecimalFormat;

//this code is for retreiving the data


class FirstJDBC {
    public static void main(String args[]) {

        //creating a connection
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "Khalid@786";
        String query = "select * from employees";
        try {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");




            //establish the connection
            Connection con = DriverManager.getConnection(url, username, password);


            // create a statement and execute the query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            // it is used while retreiving the data(Resultset)
            System.out.println("table created in database.");

            while (rs.next()){
                int id = rs.getInt("id");
                String name= rs.getNString("name");
                String job_title= rs.getString("job_title");
                String Address = rs.getString("address");
                Double Salary= rs.getDouble("salary");

                System.out.println();
                System.out.println("==============");

                //print
                System.out.println("id :" + id);
                System.out.println("Name :" + name);
                System.out.println("job_title: " + job_title);
                System.out.println("Address :" + Address);
                System.out.println("salary :" + Salary);


            }
            //close the connection
            rs.close();
            stmt.close();
            con.close();

            System.out.println();
            System.out.println("connection closed successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
