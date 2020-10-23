package ua.training.controller.command;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import ua.training.controller.model.entity.User;
import ua.training.controller.model.service.UserService;

public class AllUser implements Command {
private UserService userService ;

	    public AllUser(UserService userService) {
	        this.userService = userService;
	    }
	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		List<User> user = userService.find();
		  request.getSession().setAttribute("user" , user);
		  System.out.println(user);
		 
		return "/Beauty/alluser.jsp";
	}

}
