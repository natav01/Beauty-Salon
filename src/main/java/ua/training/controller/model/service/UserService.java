package ua.training.controller.model.service;

import java.util.List;
import java.util.Optional;

import ua.training.controller.model.entity.User;
import ua.training.controller.model.mapper.DaoFactory;
import ua.training.controller.model.mapper.UserDao;



public class UserService {
	 DaoFactory daoFactory = DaoFactory.getInstance();
	    public Optional<User> login(String name){
	        Optional<User> result; //= Optional.empty();
	        try(UserDao userDao = daoFactory.createUserDao()){
	            result = userDao.findByName(name);
	        }
	      
	        return result;
	    }
	    
	    public List <User> find(){
	        List<User> result; 
	        try(UserDao userDao = daoFactory.createUserDao()){
	            result = userDao.findAll();
	        }
	       
	        return result;
	    }
	    public void register (User user) {
	   
		        try(UserDao userDao = daoFactory.createUserDao()){
		             userDao.update(user);
		        }
		       
		       
	    }
	    
	    public void deleteUser (String login) {
		   
			        try(UserDao userDao = daoFactory.createUserDao()){
			             userDao.delete(login);
			             System.out.println("SSuUUUcSES");
			        }
			       System.out.println("NOOOOO: " );
			       
		    }
	    
	
}
