
package jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 
 * @author andre
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection con = null;

		Properties props = new Properties();		
		props.put("user", "root");
		props.put("password", "");
		
		final String user="root";
		final String password="";
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?autoReconnect=true&useSSL=false", props);
			
		
			Statement st = con.createStatement();
		
			ResultSet rs = st.executeQuery("SELECT * FROM socio");

		
			boolean hayFilas = false;
			while(rs.next()) {
				hayFilas = true;
				System.out.println(rs.getString(2));
			}
			if (!hayFilas) {
				System.out.println("No hay resultados que mostrar");
			}
			
			
			rs.close();
			st.close();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {					
					e.printStackTrace();
				}
		}
	
		
		

	}

}
