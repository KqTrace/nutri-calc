package bdconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDConexao {
	
	static Connection con;
	
	public static Connection criarConexao() {
		try {
			 Class.forName("org.hsqldb.jdbcDriver");
			 //con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/MyServerDB", "SA", "");
			 con = DriverManager.getConnection("jdbc:hsqldb:file:databaseStand", "SA", "");
			 System.out.println("Conexão realizada !");
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
	
	public static void consultarGrupo(String sql) {
		try {
			
			Connection dbConnection = getDBConnection();
			PreparedStatement ps = dbConnection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String nm_grupo = rs.getString(2);
				
				System.out.printf("ID do Grupo de Alimentos: %d | Nome do grupo: %s \n", id, nm_grupo);
			}
			
		} catch (SQLException e) {
			
		}
		
	}
	
	private static Connection getDBConnection() {
		return con;
	}
	
}
