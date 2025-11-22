import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        // 1. Database Configuration
        String url = "jdbc:mysql://localhost:3306/"; 
        String user = "root";
        String password = "your_password"; // <--- PUT YOUR MYSQL PASSWORD HERE

        try {
            // 2. Attempt Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("SUCCESS! You are connected to MySQL.");
            conn.close();
        } catch (Exception e) {
            System.out.println("CONNECTION FAILED.");
            e.printStackTrace();
        }
    }
}