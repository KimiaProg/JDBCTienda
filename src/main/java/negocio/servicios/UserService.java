package negocio.servicios;

import java.sql.SQLException;
import java.util.List;

import negocio.vo.Usuario;

/**
 * Devuelve la lista de libros
 * 
 * @author alumno
 *
 */
public interface UserService {

	public boolean login(String username,String password);

}
