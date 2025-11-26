import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
public class studentReport{

public static List<Student> printReport( ){

    List <Student>Array = new ArrayList<>();

String sql = "SELECT * FROM student_management ";

try (Connection conn = DBConnection.connect();
    PreparedStatement prepare =conn.prepareStatement(sql)){


        ResultSet results = prepare.executeQuery();

        while (results.next()){
        Student s = new Student (

        results.getInt ("student_id"),
        results.getString("Name"),
        results.getInt("Age"),
        results.getString ("Email"),
        results.getString("Course"));
        Array.add(s);}


    } catch (SQLException e ){

     e.printStackTrace();


    }



return Array;


}}