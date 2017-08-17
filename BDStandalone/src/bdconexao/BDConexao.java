package bdconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDConexao {
	
	public static Connection criarConexao() {
		try {
			 Class.forName("org.hsqldb.jdbcDriver");
			 //con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/MyServerDB", "SA", "");
			 Connection con = DriverManager.getConnection("jdbc:hsqldb:file:databaseStand", "SA", "");
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
	
}
