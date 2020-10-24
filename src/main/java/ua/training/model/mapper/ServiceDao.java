package ua.training.model.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import javax.sql.DataSource;

import ua.training.model.entity.Service;
import ua.training.model.impl.ConnectionPool;


public class ServiceDao {
	 //  private Connection connection;
	   private DataSource dataSource = ConnectionPool.getDataSource();
	   private Connection getConnection(){
	        try {
	            return dataSource.getConnection();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }

	   
	    public static Service extractFromResultSet(ResultSet rs) throws SQLException {
	    	Service service = new Service();
	    	service.setId(rs.getInt("service_id"));
	    	service.setServiceName(rs.getString("service_name"));
	    	service.setNameOfType(rs.getString("type_name"));
	    	service.setPrice(rs.getBigDecimal("price"));
	    	service.setDuration(rs.getInt("duration_in_minutes"));
	         return service;
	    	
	    	
	    }
	    
	    public Optional<Service> findAllService() {
	    	ServiceDao sd = new ServiceDao();
	    	String query  = "select services.service_id, services.service_name, "
	    			+ "type_of_services.type_name, services.price, services.duration_in_minutes"
	    			+ "from services inner join services on services.type_of_services_id = type_of_services.type_of_services_id ";
			   Optional<Service> result = Optional.empty();
			   Connection c = sd.getConnection();
		        try(Statement ps = c.createStatement()){
		           // ps.setString( 1, name);
		            ResultSet rs;
		            rs = ps.executeQuery(query);
		       //    UserMapper mapper = new UserMapper();
		            if (rs.next()){
		                result = Optional.of(extractFromResultSet(rs));
		            }//TODO : ask question how avoid two teachers with the same name
		        }catch (Exception ex){
		            throw new RuntimeException(ex);
		        }
		        return result;
		}
}
