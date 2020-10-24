package ua.training.command;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import ua.training.model.service.UserService;



public class AllUser implements Command {
private UserService userService ;

	    public AllUser(UserService userService) {
	        this.userService = userService;
	    }
	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		//List<User> user = userService.find();
		  //request.getSession().setAttribute("user" , user);
		  //System.out.println(user);
		 //request.getSession().setAttribute("page", "1");
		return "redirect:/admin/alluser.jsp?page=1";
	}

}
