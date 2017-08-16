package initialization;
import java.sql.Connection;

import bdconexao.BDConexao;

public class Init {

	public static void main(String[] args) {
		//BDConexao estabCon = new BDConexao();
		BDConexao.criarConexao();
		BDConexao.consultarGrupo("SELECT * FROM Grupo");
		
	}
	
}
