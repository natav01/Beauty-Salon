package ua.training.model.mapper;

import java.util.List;
import java.util.Optional;

import ua.training.model.entity.User;




public interface UserDao extends GenericDao<User> {
	 Optional<User> findByName(String name);

	User update(User user);

	List<User> findAll(int start, int total);
	 
}
