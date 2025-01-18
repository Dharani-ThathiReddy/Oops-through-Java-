import java.sql.*;

public class A {
    public static void main(String args[]) {
        try {
            // Load the MySQL JDBC driver (Class.forName is optional in newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection c = DriverManager.getConnection(                                                                                      
                "jdbc:mysql://localhost:3306/Dharani", "rey", "123");

            // Prepare the SQL statement
            String sql = "INSERT INTO Student (column1, column2) VALUES (?, ?)";
            PreparedStatement st = c.prepareStatement(sql);

            // Set values for the placeholders
            st.setInt(1, 234); // Example: student ID
            st.setString(2, "HJHJK"); // Example: student name

            // Execute the update (insert)
            int i = st.executeUpdate();
            System.out.println(i + " row(s) inserted");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

