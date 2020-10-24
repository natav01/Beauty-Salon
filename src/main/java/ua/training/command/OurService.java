package ua.training.command;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import ua.training.model.entity.Service;
import ua.training.model.mapper.ServiceDao;






public class OurService implements Command {
 private ServiceDao serviceDao ;

		    public OurService(ServiceDao serviceDao) {
		        this.serviceDao = serviceDao;
		    }
	@Override
	public String execute(HttpServletRequest request) {
		 Optional<Service> service = serviceDao.findAllService();
		 request.getSession().setAttribute("service" , service.get());
		 System.out.println(service);
		 return "/Beauty/service.jsp";
	}

}
