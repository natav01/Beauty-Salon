package ua.training.controller.command;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import ua.training.controller.model.entity.User;
import ua.training.controller.model.service.UserService;

public class DeleetUser implements Command {
	 private UserService userService ;

	    public DeleetUser(UserService userService) {
	        this.userService = userService;
	    }
	@Override
	public String execute(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		System.out.println("DEEEEL"+name);
		 userService.deleteUser(name);
		// TODO Auto-generated method stub
		return "/Beauty/admin.jsp";
	}

}
