import java .sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {

private static final String URL = "jbdc:mysql://localhost:3306/warehouse_db";
private static final String USER = "root";
private static final String PASSWORD = "your _password";

public static Connection connect(){

Connection conn = null ;

try {

conn = DriverManager.getConnection (URL, USER,PASSWORD);



}catch (SQLException e){

e.printStackTrace();

}

return conn ;
}

    
}
