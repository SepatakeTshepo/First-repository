import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class searchStudent {
 
    public static void getStudent( int student_id){
        
    String sql = "SELECT*FROM student_management WHERE student_id = ?";
     

    try ( Connection conn = DBConnection.connect() ;
          PreparedStatement prepare = conn.prepareStatement(sql)){
    
     
    prepare.setInt(1 , student_id );
    ResultSet results = prepare.executeQuery();

    if (results.next()){

     String name = results.getString ("Name");
     int Age = results .getInt("Age");
     String Email = results.getString("Email");
     String Course = results.getString ("Course");

     System.out.println ("Student was Found");
     System.out.println ("Student Name"+ name );
     System.out.println ("Student Age :" + Age);
     System.out.println ("Student Email : " + Email);
     System.out.println ("Student Course " + Course);


    }else {
           
System.out.println ("Student with Id  " + student_id +"Was not found");

    }
    
}catch(SQLException e ){

e.printStackTrace();


}
    }
}
