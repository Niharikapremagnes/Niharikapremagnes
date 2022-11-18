import java.sql.Connection;
import java.sql.SQLException;

public class CadastroDeProduto {

	public static void main(String[] args) throws SQLException {
		
		Produto produto = new Produto();
			produto.setId(2);
	        produto.setName("Iphone");
	        produto.setDescription("Iphone Mini 16g");
	        produto.setPrice(20000.0);
	        
	        Connection connect = new ConnectionFactory().getConnection();
	        connect.setAutoCommit(false);
	        
	        ProdutoDao dao = new ProdutoDao(connect);
	        dao.adiciona(produto);
	        
	        connect.commit();
	        connect.close();
	}
}
