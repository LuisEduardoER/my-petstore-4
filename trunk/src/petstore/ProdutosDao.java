package petstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDao {

    static PreparedStatement ps;
    // a conexão com o banco de dados
    private Connection conexao;

    public ProdutosDao() throws SQLException {
        this.conexao = new Conexao().getConexao();
    }

    public void adiciona(Produto produto) throws SQLException {
        // prepara a conexão
        String sql = "insert into produto (nome,valor,descricao) values (?,?,?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            //Executa o código SQL
            stmt.execute();
            stmt.close();
        }
    }

    public List<Produto> getLista() throws SQLException {
        String sql;
        sql = "select * from produto";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<Produto> lista = new ArrayList<>();
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId_produto(Long.valueOf(rs.getString("id_produto")));
                    produto.setNome(rs.getString("nome"));
                    produto.setValor(Double.valueOf(rs.getString("valor")));
                    produto.setDescricao(rs.getString("descricao"));
                    lista.add(produto);
                }
                return lista;
            } catch (SQLException e) {
                return null;
            }
        }

    }

    public List<Produto> getLista(String nome) throws SQLException {
        String sql = "select * from produto where nome like ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setString(1,  "%" + nome + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                List<Produto> lista = new ArrayList<>();
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId_produto(Long.valueOf(rs.getString("id_produto")));
                    produto.setNome(rs.getString("nome"));
                    produto.setValor(Double.valueOf(rs.getString("valor")));
                    produto.setDescricao(rs.getString("descricao"));
                    lista.add(produto);
                }
                return lista;
            } catch (SQLException e) {
                return null;
            }
        }
    }

    public void altera(Produto produto) throws SQLException {
        String sql = "update produto set nome = ? , valor = ? , descricao = ?  where id_produto = ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            stmt.setLong(4, produto.getId_produto());

            //executar a query
            stmt.execute();
            stmt.close();
        }
    }

    public void remove(Produto produto) throws SQLException {
        String sql = "delete from produto where id_produto = ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setLong(1, produto.getId_produto());
//            executar a query
            stmt.execute();
            stmt.close();
        }
    }
}
