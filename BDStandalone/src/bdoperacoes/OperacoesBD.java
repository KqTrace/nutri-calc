package bdoperacoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacoesBD {
	
	public static void consultarGrupo(String sql, Connection c) {
		try {
			
			Connection dbConnection = c;
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
	
	public static void consultarAlimentos(String sql, Connection c) {
		try {
			
			Connection dbConnection = c;
			PreparedStatement ps = dbConnection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String nm_ali = rs.getString(2);
				float prote = Float.parseFloat((rs.getString(3)));
				
				System.out.printf("Nr. Alimento: %d Nm Alimento: %s Proteína do alimento %f", id, nm_ali, prote);
			}
			
		} catch (SQLException e) {
			
		}
	}
	
	
}
