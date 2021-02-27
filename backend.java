import java.sql.*;
import java.io.*;
class backend{
    
    public static void main(String...)throws IOException, SQLException{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("")
            Statement stmt = con.createStatment();
            ResultSet rs = stmt.executeQuery("select *from student");
            while(rs.next())

        }
        catch(Exception e){System.out.println("e");}

    }

}