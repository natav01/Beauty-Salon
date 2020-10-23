package ua.training.controller.model.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import ua.training.controller.model.entity.User;


public class UserMapper implements ObjectMapper<User> {

    @Override
    public User extractFromResultSet(ResultSet rs) throws SQLException {
    	 User user = new User();
    	 user.setId(rs.getInt("user_id"));
    	 user.setLogin(rs.getString("login"));
    	 user.setPassword(rs.getString("password"));
    	 user.setFirstName(rs.getString("first_name"));
    	 user.setLastName(rs.getString("last_name"));
    	 user.setPhoneNumber(rs.getString("phone_number"));
    	
    	 user.setRole(User.ROLE.valueOf(rs.getString("role")));
         return user;
        
       
       
    	
    	
    }

    public User makeUnique(Map<Integer, User> cache,
                              User teacher) {
        cache.putIfAbsent(teacher.getId(), teacher);
        return cache.get(teacher.getId());
    }
}
