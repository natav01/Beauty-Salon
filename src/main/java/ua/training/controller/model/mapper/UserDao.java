package ua.training.controller.model.mapper;

import java.util.Optional;

import ua.training.controller.model.entity.User;


public interface UserDao extends GenericDao<User> {
	 Optional<User> findByName(String name);

	User update(User user);
	 
}
