import java.sql.*;
import java.io.*;
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

class Java extends  HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html");
        PrintWriter out  = res.getWriter();
        String n = req.getParameter("username");  
    String p = req.getParameter("userpass");  
          
    if(Backend.validate(n, p)){  
        RequestDispatcher rd = req.getRequestDispatcher("backend");  
        rd.forward(req,res);  
    }  
    else{  
        out.print("Sorry username or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("loginform.html");  
        rd.include(req,res);  
    }  
          
    out.close();  
    }  
}  

    
