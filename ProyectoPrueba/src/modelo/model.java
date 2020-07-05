package modelo;


import java.sql.*;

public class model {

	 private String usuario;
	 private String clave;
	
	
	
	public model(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
	}

	public model() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
