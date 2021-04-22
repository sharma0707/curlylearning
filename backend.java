import java.sql.*;
import java.io.*;

class Backend{
    
    public static void main(String arg[]){
   try{
Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","1234");
PreparedStatement stmt = con.prepareStatement("select * from user where  name = "SONU", pass = "SHARMA" ");
ResultSet rs=stmt.executeQuery();
while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2));
}

con.close();

}
catch(Exception e){ System.out.println(e);}

}
