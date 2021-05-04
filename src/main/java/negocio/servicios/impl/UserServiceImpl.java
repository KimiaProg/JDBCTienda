package negocio.servicios.impl;

import negocio.servicios.UserService;
import persistencia.UserDAO;
import persistencia.dao.impl.UserDAOImpl;

public class UserServiceImpl implements UserService {

	UserDAO userDao = new UserDAOImpl();
	public boolean login(String username,String password) {
		return userDao.login(username, password);		
	}

}
