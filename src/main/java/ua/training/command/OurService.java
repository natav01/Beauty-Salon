package ua.training.command;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import ua.training.model.entity.Service;
import ua.training.model.mapper.ServiceDao;
import ua.training.model.service.ServiceService;


public class OurService implements Command {
 private ServiceService serviceDao ;

		    public OurService(ServiceService serviceDao) {
		        this.serviceDao = serviceDao;
		    }
	@Override
	public String execute(HttpServletRequest request) {
		 List<Service> service = serviceDao.find();
		 request.getSession().setAttribute("service" , service);
		 System.out.println(service);
		 String path = request.getRequestURI();
		 System.out.println(path);
		 return "redirect:/service.jsp";
	}

}
