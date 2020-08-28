 package httpsession2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.println("Welcome "+n);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",n);  
  
        out.println("<a href='servlet2'>visit</a>");  
                  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
}
