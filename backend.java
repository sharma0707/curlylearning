import java.sql.*;
import java.io.*;

class Backend{
    
    public static boolean validate (String name, Strig pass){
        boolean status = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
            PreparedStatement ps=con.prepareStatement("select *from user where name = SONU and pass= SHARMA");
            ps.setString(1 , name);
            ps.setString(2, pass);
            ResultSet rs=ps.executeQuery();  
            status=rs.next();  

        }
        catch(Exception e){System.out.println(e);}  
        return status;

    }

}