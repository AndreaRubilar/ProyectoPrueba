package conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSingleton {

	
		
		private static Connection conn = null;
		private String driver;
		private String url;
		private String usuario;
		private String password;
		
		private conexionSingleton() {
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			driver = "oracle.jdbc.driver.OracleDriver";
			usuario = "usrtest2";
			password = "1234";
			
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, usuario, password);	
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getConnection() {
			if (conn == null) {
				new conexionSingleton();
			}
			return conn;
		}
	
	


	}


