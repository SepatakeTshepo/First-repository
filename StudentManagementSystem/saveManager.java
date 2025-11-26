import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class saveManager {

    public static void saveStudent(List <Student> Array ){

        String sql = "INSERT INTO student_management ( student_id ,Name ,  Age ,Email ,Course) VALUES (? , ? ,? , ? , ?)";

    try (Connection conn = DBConnection.connect();
        PreparedStatement prepared = conn.prepareStatement(sql)

    ){


        for (Student a : Array ){
        prepared.setInt (1 , a.getId());
        prepared.setString(2 ,a. getName() );
        prepared.setInt (3 , a.getAge());
        prepared.setString (4 ,a. getEmail());
        prepared.setString (5 , a.getCourse());
     
        prepared.executeUpdate();//sends to the data//base
        System.out.println (  a.getName()+ " Is Successfully Saved ");

        }
System.out.println ("All Students have been saved successfully");
    }catch (SQLException e ){
 e.printStackTrace();


    }
    
}
}