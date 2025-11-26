import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/student_management"; 
    private static final String USER = "root";
    private static final String PASSWORD = "YOUR PASSWORD HERE "; 

    
    // It must be 'public' and 'static' to be called as DBConnection.connect()
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
        return conn; 
    }
}