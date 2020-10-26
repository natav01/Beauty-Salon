package ua.training.model.mapper;

import java.util.List;
import java.util.Optional;

import ua.training.model.entity.Service;

public interface ServiceDao extends GenericDao{
	 List<Service> findAll();

		
}
