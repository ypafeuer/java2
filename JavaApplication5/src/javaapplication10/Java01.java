package javaapplication10;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.sql.*;
public class Java01 {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    
    static final String USER = "root";
    static final String PASS = "12345678";
 
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
        
            
            System.out.println("連線中");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            
            System.out.println(" 實體化Statement對象...");
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO `websites` (`id`, `name`, `url`)" + "VALUES (1004, 'Cramden', 'New York')");
            String sql;
            ResultSet rs;
            stmt.executeUpdate("INSERT INTO `websites` (`id`, `name`, `url`)" + "VALUES (2224, 'Cramden', 'New York')");

            sql = ""+
                    "SELECT id, name, url FROM websites"+"\n";
            rs = stmt.executeQuery(sql);
            //stmt.executeUpdate(sql);
            //stmt.executeUpdate("INSERT INTO `websites` (`id`, `name`, `url`)" + "VALUES (44444, 'Cramden', 'New York')");



            
            while(rs.next()){
             
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
      
                System.out.print("ID: " + id);
                System.out.print(", name: " + name);
                System.out.print(", URL: " + url);
                System.out.print("\n");
            }

            
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
         
            se.printStackTrace();
        }catch(Exception e){
            
            e.printStackTrace();
        }finally{
            
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("bye!");
    }
}