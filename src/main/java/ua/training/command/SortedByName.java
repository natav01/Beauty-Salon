package ua.training.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import ua.training.model.entity.Service;
import ua.training.model.service.ServiceService;

public class SortedByName implements Command{
	private ServiceService serviceDao ;

    public SortedByName(ServiceService serviceDao) {
        this.serviceDao = serviceDao;
    }
@Override
public String execute(HttpServletRequest request) {
 List<Service> service = serviceDao.sort();
 System.out.println("Service: ");
 service.toString();
 request.getSession().setAttribute("serviceSorted" , service);
 System.out.println(service);
 return "redirect:/sorted.jsp";
}
}
