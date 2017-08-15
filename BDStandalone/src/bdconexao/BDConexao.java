package bdconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDConexao {
	
	public static Connection criarConexao() {
		try {
			 Class.forName("org.hsqldb.jdbcDriver");
			 Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/MyServerDB", "SA", "");
			 System.out.println("Conexão realizada !");
			 
			    Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM Grupo");
				
				while (rs.next()) {
					
					int id = rs.getInt(1);
					String nm_grupo = rs.getString(2);
					
					System.out.printf("ID do Grupo de Alimentos: %d | Nome do grupo: %s", id, nm_grupo);
				}
				
			 return con;
		}catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o Driver JDBC.");
			return null;
		}catch(SQLException f) {
			System.out.println("Erro de SQL: " + f);
			f.printStackTrace();
			return null;
		}
	}
	
	public void consultarGrupo(String sql) {
		try {
			
			Connection dbConnection = this.getDBConnection();
			Statement stmt = this.getDBConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String nm_grupo = rs.getString(2);
				
				System.out.printf("ID do Grupo de Alimentos: %d | Nome do grupo: %s", id, nm_grupo);
			}
			
		} catch (SQLException e) {
		}
		
	}
	
	private Connection getDBConnection() {
		return con;
	}
	
}
