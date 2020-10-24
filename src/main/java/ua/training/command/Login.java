package ua.training.command;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.training.model.entity.User;
import ua.training.model.service.UserService;




public class Login implements Command {
	private static final Logger logger = LogManager.getLogger(Login.class);
    private UserService service ;
    private String massage ;
    private static final String ENTER_ALL_DATA = "label.enterAllData";
    private static final String WRONG_LOGIN_OR_PASSWORD = "label.wrongLogin";

    public Login(UserService service) {
        this.service = service;
    }
	    @Override
	    public String execute(HttpServletRequest request) {
	    	String name = request.getParameter("name");
	        String pass = request.getParameter("pass");
	      


	        if (!isValid(name, pass)){
	            request.setAttribute("massage", massage);
	            return "/login.jsp";
	        }

	        Optional<User> user = service.login(name);
	       
	        if( user.isPresent() && user.get().getPassword().equals(pass)){
	            if (CommandUtility.checkUserIsLogged(request, name)){
	                return "/error.jsp";
	            }

	            request.getSession().setAttribute("name" , name);
	            request.getSession().setAttribute("id" , user.get().getId());
	            logger.debug("logged user id {}", user.get().getId());
	            request.getSession().setAttribute("role" , user.get().getRole().name());
	            System.out.println("Login" + request.getSession().getAttribute("role"));
	            request.getSession().setAttribute("user" , user.get());
	            logger.info("user "+ name+" logged successfully.");
	            return CommandUtility.getHomePageForUser(user.get().getRole());

	        }
	        logger.info("Invalid attempt of login user:{}", name);
	        request.setAttribute("massage", WRONG_LOGIN_OR_PASSWORD);
	        return "/login.jsp";
	    }

	    /**
	     * Checks if login and password is valid
	     * @param name user's login
	     * @param pass user's password
	     * @return boolean result of validation
	     */
	    private boolean isValid(String name, String pass){
	        if (name == null)
	            return false;
	        else if (name.isEmpty() || pass.isEmpty()){
	            massage = ENTER_ALL_DATA;
	            return false;
	        }

	        return true;
	    }
	}