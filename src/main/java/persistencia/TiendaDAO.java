package persistencia;

import java.sql.SQLException;
import java.util.List;

import negocio.vo.Usuario;

public interface TiendaDAO {
	public boolean login(String username,String password);
}
