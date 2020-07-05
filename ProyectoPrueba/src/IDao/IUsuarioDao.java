package IDao;

import java.util.List;

import modelo.usuario;

public interface IUsuarioDao {

	public boolean crearUsuario(usuario user);
	public List<usuario> leerUsuarios();
	public boolean actualizarUsuario(usuario user);
	public boolean eliminarUsuario(usuario user);
	public usuario obtenerUsuario(int idusuario);
	public usuario obtenerUsuarioByLogin(String loginusuario);
	
}


