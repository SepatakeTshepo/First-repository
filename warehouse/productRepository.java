import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class productRepository {

    public static void saveProduct(int id ,String name , String category , int price , int stock_quantity,
        boolean is_active
    ){

   String sql ="INSERT INTO product ( id ,name , category , price ,stock_quantity ,is_active )  VALUES (? , ? , ? , ? , ? )";


   try (Connection conn = DBConnection.connect ();
        PreparedStatement prstm = conn.prepareStatement (sql ) ){
   
            prstm.setInt (1,id);
            prstm.setString (2 , "name ");
            prstm.setString(3 , " category ");
            prstm.setInt (4 , price );
            prstm.setInt (5 ,stock_quantity);
            prstm.setInt  (6 , is_active  ? 1 : 0  );

            prstm.executeUpdate();

            System.out.println ("All product were Succesfully Saved ");


        }catch (SQLException e ){

     e.printStackTrace();


        }
    }


      public List<product> getAll(){


        List<product>Array = new ArrayList<>();


        String sqll = "SELECT*FROM product" ;



       try (Connection conn = DBConnection.connect();
       PreparedStatement prstm = conn.prepareStatement (sqll)){


   
      ResultSet set = prstm.executeQuery();



      if (set.next()){


     boolean activeStatus = set.getInt ("is_active ")==1 ;

     product p = new product (
    
    set.getInt("id"),
    set.getString ("name "),
    set.getString ("category "),
    set.getInt ("price"),
    set.getInt("stock_quantity"),
    activeStatus
     );

Array.add(p);


}

       }catch (SQLException e){




       }

return Array;

        }

    }
    

