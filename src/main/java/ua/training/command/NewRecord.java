package ua.training.command;

import javax.servlet.http.HttpServletRequest;

public class NewRecord  implements Command {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		 String name = request.getParameter("service.serviceName");
	     String surname = request.getParameter("price");
	     System.out.println(name +" "+ surname);
		return "redirect:/record.jsp";
	}

}
