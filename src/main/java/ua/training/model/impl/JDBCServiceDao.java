package ua.training.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import ua.training.model.entity.Service;
import ua.training.model.entity.User;
import ua.training.model.mapper.ServiceDao;
import ua.training.model.mapper.ServiceMapper;
import ua.training.model.mapper.UserMapper;

public class JDBCServiceDao implements ServiceDao {
	  private Connection connection;
private final String SELECTAll = "select services.service_id, services.service_name, type_of_services.type_name, services.price, services.duration_in_minutes, user.login from services , type_of_services,  user where services.type_of_service_id = type_of_services.type_of_services_id and services.master_id = user.user_id";

	    public JDBCServiceDao(Connection connection) {
	        this.connection = connection;
	    }


		@Override
		public List<Service> findAll() {
			  Map<Integer, Service> services = new HashMap<>();
		       

		      //  final String query = "" +
		        //        " select * from user" ;
		        try (PreparedStatement st = connection.prepareStatement(SELECTAll)) {
		            ResultSet rs = st.executeQuery();

		            ServiceMapper serviceMapper = new ServiceMapper();
		          

		            while (rs.next()) {
		                Service service = serviceMapper
		                        .extractFromResultSet(rs);
		              
		              service = serviceMapper
		                   .makeUnique(services, service);
		               
		            }
		          // services.forEach((k,v)->System.out.println(k, v));
		            return new ArrayList<>(services.values());
		        } catch (SQLException e) {
		            e.printStackTrace();
		            return null;
		        }
		}


		@Override
		public void create(Object entity) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public Object findById(int id) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List findAll(int start, int total) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public void delete(String login) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void close() {
			// TODO Auto-generated method stub
			
		}

 public final String SORTED = "select services.service_id, services.service_name, type_of_services.type_name, services.price, services.duration_in_minutes, user.login from services , type_of_services,  user where services.type_of_service_id = type_of_services.type_of_services_id and services.master_id = user.user_id order by login";
		@Override
		public List<Service> findByMasterName() {
			 Map<Integer, Service> services = new HashMap<>();
		

		     
		        try (PreparedStatement st = connection.prepareStatement(SORTED)) {
		            ResultSet rs = st.executeQuery();

		            ServiceMapper serviceMapper = new ServiceMapper();
		          

		            while (rs.next()) {
		                Service service = serviceMapper
		                        .extractFromResultSet(rs);
		              
		                service = serviceMapper
		                        .makeUnique(services, service);
		               
		            }
		            return new ArrayList<>(services.values());
		        } catch (SQLException e) {
		            e.printStackTrace();
		            return null;
		        }
		}
}
