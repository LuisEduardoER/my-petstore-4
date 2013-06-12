package petstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    static PreparedStatement ps;
    // a conexão com o banco de dados
    private Connection conexao;

    public ClienteDao() throws SQLException {
        this.conexao = new Conexao().getConexao();
    }

    public void adiciona(Cliente cliente) throws SQLException {
        // prepara a conexão
        String sql = "insert into cliente " + " (nome , data_nascimento , sexo , estado_civil , profissao , rg , cpf , logradouro , endereco , numero , bairro , cep , cidade , uf , telefone_residencial , telefone_comercial , celular , email) " + " values (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getData_nasc());
            stmt.setString(3, cliente.getSexo());
            stmt.setString(4, cliente.getEstado_civil());
            stmt.setString(5, cliente.getProfissao());
            stmt.setString(6, cliente.getRg());
            stmt.setString(7, cliente.getCpf());
            stmt.setString(8, cliente.getLogradouro());
            stmt.setString(9, cliente.getEndereco());
            stmt.setLong(10, cliente.getNumero());
            stmt.setString(11, cliente.getBairro());
            stmt.setString(12, cliente.getCep());
            stmt.setString(13, cliente.getCidade());
            stmt.setString(14, cliente.getUf());
            stmt.setString(15, cliente.getTel_res());
            stmt.setString(16, cliente.getTel_com());
            stmt.setString(17, cliente.getCelular());
            stmt.setString(18, cliente.getEmail());
            
            //Executa o código SQL
            stmt.execute();
            stmt.close();
        }
    }

    public List<Cliente> getLista() throws SQLException {
        String sql;
        sql = "select * from cliente";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<Cliente> lista = new ArrayList<>();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId_cliente(Long.valueOf(rs.getString("id_cliente")));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setData_nasc(rs.getString("data_nascimento"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstado_civil(rs.getString("estado_civil"));
                    cliente.setProfissao(rs.getString("profissao"));
                    cliente.setRg(rs.getString("rg"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setLogradouro(rs.getString("logradouro"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setNumero(Long.valueOf(rs.getString("numero")));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setUf(rs.getString("uf"));
                    cliente.setTel_res(rs.getString("telefone_residencial"));
                    cliente.setTel_com(rs.getString("telefone_comercial"));
                    cliente.setCelular(rs.getString("celular"));
                    cliente.setEmail(rs.getString("email"));
                    lista.add(cliente);
                }
                return lista;
            } catch (SQLException e) {
                return null;
            }
        }
    }

    public List<Cliente> getLista(String nome) throws SQLException {
        String sql = "select * from cliente where nome like ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setString(1, "%" + nome + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                List<Cliente> lista = new ArrayList<>();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId_cliente(Long.valueOf(rs.getString("id_cliente")));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setData_nasc(rs.getString("data_nascimento"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstado_civil(rs.getString("estado_civil"));
                    cliente.setProfissao(rs.getString("profissao"));
                    cliente.setRg(rs.getString("rg"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setLogradouro(rs.getString("logradouro"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setNumero(Long.valueOf(rs.getString("numero")));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setUf(rs.getString("uf"));
                    cliente.setTel_res(rs.getString("telefone_residencial"));
                    cliente.setTel_com(rs.getString("telefone_comercial"));
                    cliente.setCelular(rs.getString("celular"));
                    cliente.setEmail(rs.getString("email"));
                    lista.add(cliente);
                }
                return lista;
            } catch (SQLException e) {
                return null;
            }
        }
    }

    public void altera(Cliente cliente) throws SQLException {
        String sql = "update cliente set nome = ? , data_nascimento  = ? , sexo  = ? , estado_civil  = ? , profissao = ? , rg = ? , cpf = ? , logradouro  = ? , endereco = ? , numero  = ? , bairro  = ? , cep = ? , cidade  = ? , uf  = ? , telefone_residencial  = ? , telefone_comercial  = ? , celular  = ? , email  = ? where id_cliente = ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getData_nasc());
            stmt.setString(3, cliente.getSexo());
            stmt.setString(4, cliente.getEstado_civil());
            stmt.setString(5, cliente.getProfissao());
            stmt.setString(6, cliente.getRg());
            stmt.setString(7, cliente.getCpf());
            stmt.setString(8, cliente.getLogradouro());
            stmt.setString(9, cliente.getEndereco());
            stmt.setLong(10, cliente.getNumero());
            stmt.setString(11, cliente.getBairro());
            stmt.setString(12, cliente.getCep());
            stmt.setString(13, cliente.getCidade());
            stmt.setString(14, cliente.getUf());
            stmt.setString(15, cliente.getTel_res());
            stmt.setString(16, cliente.getTel_com());
            stmt.setString(17, cliente.getCelular());
            stmt.setString(18, cliente.getEmail());
            stmt.setLong(19, cliente.getId_cliente());

            //executar a query
            stmt.execute();
            stmt.close();
        }
    }

    public void remove(Cliente cliente) throws SQLException {
        //Removendo dependências do Cliente
        AnimalDao animalDao = new AnimalDao();
        animalDao.removePeloIdCliente(cliente.getId_cliente());
        
        String sql = "delete from cliente where id_cliente = ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setLong(1, cliente.getId_cliente());
            //executar a query
            stmt.execute();
            stmt.close();
        }
    }
}
