package persistencia.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistencia.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean login(String username, String password) {
		
		Connection con = getConnection();
		boolean loginSucces = false;
		String sql = "select * from Users where username= ? and password=?;";
		try {
			PreparedStatement sentencia = con.prepareStatement(sql);
			sentencia.setString(1, username);
			sentencia.setString(2, password);
			ResultSet rs = sentencia.executeQuery(sql);
			loginSucces = rs.next();
		} catch (SQLException e) {
			System.out.println("Error");
		}
		return loginSucces;
	}

	private Connection getConnection() {
		Connection dm = null;
		try {
			dm = DriverManager.getConnection("jdbc:mysql://localhost:6033/shop", "developer", "programaciondaw");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dm;
	}

}
