package persistencia.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import negocio.vo.Genero;
import negocio.vo.Usuario;
import persistencia.TiendaDAO;

public class TiendaDAOImpl implements TiendaDAO {

	@Override
	public boolean login(String username, String password) {
		/*Connection con= getConnection();
		boolean loginSucces=false;
		String sql="select * from Users where username='" + username + "' and password='" + password + "';";
		Statement sentencia= con.createStatement();
		Resultset rs=sentencia.executeQuery(sql);
		loginSucces= ((ResultSet) rs).next();*/
		
		Connection con= getConnection();
		boolean loginSucces=false;
		String sql="select * from Users where username= ? and password=?;";
		PreparedStatement sentencia= con.prepareStatement(sql);
		sentencia.setString(1, username);
		sentencia.setString(2, password);
		Resultset rs=sentencia.executeQuery(sql);
		loginSucces= ((ResultSet) rs).next();
		return false;
	}
	
	private Connection getConnection() {
		Connection dm=null;
		try {
			 dm= DriverManager.getConnection("jdbc:mysql://localhost:6033/shop", "developer", "programaciondaw");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dm;
	}

}
