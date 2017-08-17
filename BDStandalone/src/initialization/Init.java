package initialization;
import java.sql.Connection;

import bdconexao.BDConexao;
import bdoperacoes.OperacoesBD;

public class Init {

	public static void main(String[] args) {
		//BDConexao estabCon = new BDConexao();
		//BDConexao.criarConexao();
		//BDConexao.consultarGrupo("SELECT * FROM Grupo");	
		Connection c = BDConexao.criarConexao();
		OperacoesBD op = new OperacoesBD();
		//op.consultarGrupo("SELECT * FROM Grupo", c);
		op.consultarAlimentos("SELECT nr_ali, desc_ali, proteina FROM Alimento", c);
	}
	
}
