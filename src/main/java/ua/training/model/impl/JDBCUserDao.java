package ua.training.model.impl;



import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import ua.training.model.entity.User;
import ua.training.model.mapper.UserDao;
import ua.training.model.mapper.UserMapper;




public class JDBCUserDao implements UserDao {
    private Connection connection;


    public JDBCUserDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(User entity) {

    }

    @Override
    public User findById(int id) {
        return null;
    }


	@Override
    public List<User> findAll(int start, int total) {
        Map<Integer, User> students = new HashMap<>();
       

      //  final String query = "" +
        //        " select * from user" ;
        try (PreparedStatement st = connection.prepareStatement("select * from user limit "+ (start-1)+","+total)) {
            ResultSet rs = st.executeQuery();

            UserMapper userMapper = new UserMapper();
          

            while (rs.next()) {
                User student = userMapper
                        .extractFromResultSet(rs);
              
                student = userMapper
                        .makeUnique(students, student);
               
            }
            return new ArrayList<>(students.values());
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

private String insertQuery = "insert into user (login, password, first_name, last_name, phone_number, role_id)"+
"values(?, ?, ?, ?, ?, 2)";


  private String deleteUser = "delete from user where login = ?";

    @Override
    public void delete(String login) {
    	 try(PreparedStatement ps = connection.prepareCall(deleteUser)){
	            ps.setString( 1, login);
	           
	           // ResultSet rs;
	             ps.executeUpdate();
	         
	        }catch (Exception ex){
	            throw new RuntimeException(ex);
	        }
    }

    @Override
    public void close()  {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

	@Override
	public Optional<User> findByName(String name) {
		   Optional<User> result = Optional.empty();
	        try(PreparedStatement ps = connection.prepareCall("SELECT * FROM user WHERE login = ?")){
	            ps.setString( 1, name);
	            ResultSet rs;
	            rs = ps.executeQuery();
	           UserMapper mapper = new UserMapper();
	            if (rs.next()){
	                result = Optional.of(mapper.extractFromResultSet(rs));
	            }//TODO : ask question how avoid two teachers with the same name
	        }catch (Exception ex){
	            throw new RuntimeException(ex);
	        }
	        return result;
	}

	@Override
	public User update(User entity) {
		
    	 try(PreparedStatement ps = connection.prepareCall(insertQuery)){
	            ps.setString( 1, entity.getLogin());
	            ps.setString( 2, entity.getPassword());
	            ps.setString(3, entity.getFirstName());
	            ps.setString(4, entity.getLastName());
	            ps.setString(5, entity.getPhoneNumber());
	           // ResultSet rs;
	             ps.executeUpdate();
	         
	        }catch (Exception ex){
	            throw new RuntimeException(ex);
	        }
		return entity;
		// TODO Auto-generated method stub
		
	}
}
