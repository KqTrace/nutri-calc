package bdconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConexao {

	public void conectar() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:hsqldb:file:/bancoDados/MyServerDB", "sa", "");
			System.out.println("Conexão realizada !");
		}catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o Driver JDBC.");
		}catch(SQLException f) {
			System.out.println("Erro de SQL: " + f);
			f.printStackTrace();
		}
	}
	
	
	
}
