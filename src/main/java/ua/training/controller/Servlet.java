package ua.training.controller;



import ua.training.controller.command.*;
import ua.training.controller.command.Exception;
import ua.training.controller.model.mapper.ServiceDao;
import ua.training.controller.model.service.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Servlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Command> commands = new HashMap<>();

    public void init(ServletConfig servletConfig){
    	servletConfig.getServletContext()
        .setAttribute("loggedUsers", new HashSet<String>());
        commands.put("logout", new LogOut());
        commands.put("login", new Login(new UserService()));
        commands.put("delete", new DeleetUser(new UserService()));
        commands.put("find", new AllUser(new UserService()));
        commands.put("registration", new Registration(new UserService()));
        commands.put("ourservice" , new OurService(new ServiceDao()));
        commands.put("exception" , new Exception());
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String path = request.getRequestURI();
        path = path.replaceAll(".*/api/" , "");
          Command command = commands.getOrDefault(path ,
                  (r)->"/index.jsp");
          System.out.println(command.getClass().getName());
          String page = command.execute(request);
          response.sendRedirect(page);
    	// String path = request.getRequestURI();
        // path = path.replaceAll(".*/api/" , "");

        /* Command command = commands.getOrDefault(path ,
                 (r)->"/index.jsp");
         String page = command.execute(request);
         if(page.contains("redirect:")){
             response.sendRedirect(page.replace("redirect:", "/Beauty"));
         }else {
             request.getRequestDispatcher(page).forward(request, response);
         }*/
    }
}