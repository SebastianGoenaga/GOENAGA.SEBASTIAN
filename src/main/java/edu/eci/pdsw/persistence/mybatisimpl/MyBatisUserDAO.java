package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.UserMapper;

public class MyBatisUserDAO implements UserDAO {

	@Inject
	UserMapper userMapper;
	
	@Override
	public List<User> loadAll() throws PersistenceException {
		try {
			return userMapper.getUsers();			
		} catch(Exception e) {
			throw new PersistenceException("Load all persistence error"+e.getLocalizedMessage());
		}
	}
	

}