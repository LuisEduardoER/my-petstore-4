package petstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDao {

    static PreparedStatement ps;
    // a conexão com o banco de dados
    private Connection conexao;

    public AnimalDao() throws SQLException {
        this.conexao = new Conexao().getConexao();
    }

    public void adiciona(Animal animal) throws SQLException {
        // prepara a conexão
        String sql = "insert into animal " + "(proprietario , nome_completo , apelido , sexo , rga , num_doc , data_nasc , especie , raca , cor , observacoes, id_cliente) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, animal.getProprietario());
            stmt.setString(2, animal.getNome_animal());
            stmt.setString(3, animal.getApelido());
            stmt.setString(4, animal.getSexo());
            stmt.setString(5, animal.getRga());
            stmt.setString(6, animal.getNum_doc());
            stmt.setString(7, animal.getData_nasc());
            stmt.setString(8, animal.getEspecie());
            stmt.setString(9, animal.getRaca());
            stmt.setString(10, animal.getCor());
            stmt.setString(11, animal.getObservacoes());
            stmt.setLong(12, animal.getId_cliente());
            //Executa o código SQL
            stmt.execute();
            stmt.close();
        }
    }

    public List<Animal> getLista() throws SQLException {
        String sql;
        sql = "select * from animal";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<Animal> lista = new ArrayList<>();
                while (rs.next()) {
                    Animal animal = new Animal();
                    animal.setId_animal(Long.valueOf(rs.getString("id_animal")));
                    animal.setProprietario(rs.getString("proprietario"));
                    animal.setNome_animal(rs.getString("nome_completo"));
                    animal.setApelido(rs.getString("apelido"));
                    animal.setSexo(rs.getString("sexo"));
                    animal.setRga(rs.getString("rga"));
                    animal.setNum_doc(rs.getString("num_doc"));
                    animal.setData_nasc(rs.getString("data_nasc"));
                    animal.setEspecie(rs.getString("especie"));
                    animal.setRaca(rs.getString("raca"));
                    animal.setCor(rs.getString("cor"));
                    animal.setObservacoes(rs.getString("observacoes"));
                    lista.add(animal);
                }
                return lista;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    public List<Animal> getLista(String nome_completo) throws SQLException {
        
        String sql = "select * from animal where nome_completo like ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setString(1,  "%" + nome_completo + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                List<Animal> lista = new ArrayList<>();
                while (rs.next()) {
                    Animal animal = new Animal();
                    animal.setId_animal(Long.valueOf(rs.getString("id_animal")));
                    animal.setProprietario(rs.getString("proprietario"));
                    animal.setNome_animal(rs.getString("nome_animal"));
                    animal.setApelido(rs.getString("apelido"));
                    animal.setSexo(rs.getString("sexo"));
                    animal.setRga(rs.getString("rga"));
                    animal.setNum_doc(rs.getString("num_doc"));
                    animal.setData_nasc(rs.getString("data_nasc"));
                    animal.setEspecie(rs.getString("especie"));
                    animal.setRaca(rs.getString("raca"));
                    animal.setCor(rs.getString("cor"));
                    animal.setObservacoes(rs.getString("observacoes"));
                    lista.add(animal);
                }
                return lista;
            } catch (SQLException e) {
                return null;
            }
        }
    }

    public void altera(Animal animal) throws SQLException {
        String sql = "update animal set nome_completo = ? , apelido = ? , sexo = ? , rga = ? , num_doc = ? , data_nasc = ? , especie= ? , raca = ?, cor= ? , observacoes = ? where id_animal = ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setString(1, animal.getNome_animal());
            stmt.setString(2, animal.getApelido());
            stmt.setString(3, animal.getSexo());
            stmt.setString(4, animal.getRga());
            stmt.setString(5, animal.getNum_doc());
            stmt.setString(6, animal.getData_nasc());
            stmt.setString(7, animal.getEspecie());
            stmt.setString(8, animal.getRaca());
            stmt.setString(9, animal.getCor());
            stmt.setString(10, animal.getObservacoes());
            stmt.setLong(11, animal.getId_animal());
            
            //executar a query
            stmt.execute();
            stmt.close();
        }
    }

    public void remove(Animal animal) throws SQLException {
        String sql = "delete from animal where id_animal = ?";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setLong(1, animal.getId_animal());
            //executar a query
            stmt.execute();
            stmt.close();
        }
    }
    
    public void removePeloIdCliente(Long id_cliente) throws SQLException {
        String sql = "delete from animal where id_cliente = ?";
        try (
        PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setLong(1, id_cliente);
            //executar a query
            stmt.execute();
            stmt.close();
        }
    }
}