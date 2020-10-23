package ua.training.controller.command;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import ua.training.controller.model.entity.User;
import ua.training.controller.model.impl.JDBCUserDao;
import ua.training.controller.model.service.UserService;

public class Registration implements Command {
	
	  private UserService userService ;

	    public Registration(UserService userService) {
	        this.userService = userService;
	    }
    @Override
    public String execute(HttpServletRequest request) {
    	 String name = request.getParameter("name");
	     String surname = request.getParameter("surname");
	     String email = request.getParameter("email");
	     String username = request.getParameter("username");
	     String password = request.getParameter("password");
	     String phone = request.getParameter("phone");
	     if( name == null || name.equals("") || surname == null || surname.equals("") 
	    		 || email == null || email.equals("") || username == null ||
	    		 username.equals("") || password == null || password.equals("")||
	    		 phone == null || phone.equals("")
	    		 ){
	            return "/registration.jsp";
	        }
	     User user = new User();
	     user.setFirstName(name);
	     user.setLastName(surname);
	     user.setLogin(username);
	     user.setPassword(password);
	     user.setPhoneNumber(phone);
	   
	     System.out.println(user);
	     Optional<User> user2 = userService.login(username);
	   //  System.out.println( user2.isPresent());
	    // System.out.println( password.equals(user2.get().getPassword()));
	    // System.out.println(phone.equals(user2.get().getPhoneNumber()));
	    // System.out.println(username.equals(user2.get().getLogin()));
	  if( user2.isPresent() ) {
		  
		  if (  password.equals(user2.get().getPassword()) 
	               || phone.equals(user2.get().getPhoneNumber())
	                || username.equals(user2.get().getLogin()))
   
		  { System.out.println("Invalidt");}
		
	     }  else {
	 	userService.register(user);
	 	return "/login.jsp";
	     }
	            
	    
        return "/registration.jsp";
    }
}
