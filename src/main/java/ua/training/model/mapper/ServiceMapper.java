package ua.training.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import ua.training.model.entity.Service;


public class ServiceMapper implements ObjectMapper<Service> {

	@Override
	public Service extractFromResultSet(ResultSet rs) throws SQLException {
		 Service service = new Service();
		 service.setId(rs.getInt("service_id"));
    	 service.setServiceName(rs.getString("service_name"));
    	 service.setNameOfType(rs.getString("type_name"));
    	 service.setPrice(rs.getBigDecimal("price"));
    	 service.setDuration(rs.getInt("duration_in_minutes"));
		 return service;
	}

	@Override
	public Service makeUnique(Map<Integer, Service> cache, Service service) {
		  cache.putIfAbsent(service.getId(), service);
	        return cache.get(service.getId());
	}

}
