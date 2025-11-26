import java.sql.Connection ;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteStudent {

    public static void removeStudent (int student_id){


String sql = "DELETE FROM  student_management WHERE student_id = ?";

try (Connection conn = DBConnection.connect();
    PreparedStatement prepare = conn.prepareStatement (sql )){

   prepare.setInt(1 , student_id);
   int rowsAffected = prepare.executeUpdate();

   if (rowsAffected>0){
   System.out.println ("Student with "+ student_id +" was deleted ");

   }else{

 System.out.println ("Student with ID " + student_id +" was not found" );
   }

    }catch (SQLException e){

    e.printStackTrace();

    }

    }

    }

