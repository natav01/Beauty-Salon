package ua.training.model.service;

import java.util.List;

import ua.training.model.entity.Service;
import ua.training.model.mapper.DaoFactory;
import ua.training.model.mapper.ServiceDao;

public class ServiceService {
	 DaoFactory daoFactory = DaoFactory.getInstance();
	 
	    public List <Service> find(){
	        List<Service> result; 
	        try(ServiceDao serviceDao = daoFactory.createServiceDao()){
	            result = serviceDao.findAll();
	        }
	       
	        return result;
	    }
}
