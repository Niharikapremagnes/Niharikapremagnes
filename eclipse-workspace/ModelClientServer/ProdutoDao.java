import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

	private Connection connect;

	public ProdutoDao(Connection connection) {
		this.connect = connection;
	}

	public void adiciona(Produto produto) {
		try {
			
			PreparedStatement ps = this.connect.prepareStatement("insert into Productlist(id,name, description, price) value (?,?, ?, ?)");
			ps.setInt(1, produto.getId());
			ps.setString(2, produto.getName());
			ps.setString(3, produto.getDescription());
			ps.setDouble(4, produto.getPrice());
			
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Produto> lista() {
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			
			PreparedStatement ps = this.connect
					.prepareStatement("select id, name, description, price from Productlist");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getDouble("price"));
				
				produtos.add(p);
			}
			
			ps.close();
			
			return produtos;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Produto> listaPaginada(int primeiro, int quantidade) {
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			
			PreparedStatement ps = this.connect
					.prepareStatement("select id, name, description, price from Productlist LIMIT ?,? ");
			ps.setInt(1, primeiro);
			ps.setInt(2, quantidade);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getDouble("price"));				
				
				produtos.add(p);
			}
			
			ps.close();
			
			return produtos;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
