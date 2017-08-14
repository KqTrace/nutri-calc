package initialization;
import bdconexao.BDConexao;

public class Init {

	public static void main(String[] args) {
		BDConexao con = new BDConexao();	
		con.conectar();
		
		
	}
	
}
