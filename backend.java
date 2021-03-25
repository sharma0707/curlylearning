import java.sql.*;
import java.io.*;
class backend{
    
    public static void main(String...)throws IOException, SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/users","root", "1234");
            Statement stmt = con.createStatment();
            ResultSet rs = stmt.executeQuery("select *from students");
            while(rs.next())
            {
                System.out.println("rs.getInt(1)+ " "+rs.getString(2)");
            }
            
            con.close();
        }
        catch(Exception e){System.out.println("e");}

    }

}