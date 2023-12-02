import java.sql.Connection;
import java.sql.DriverManager;

public class EmpleadoDAO {
	private Connection conexion;
	
	
	private void connect() {
		try {
			String url="";
			String user="";
			String password="";
			
			this.conexion=DriverManager.getConnection(url, user, password);	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
	