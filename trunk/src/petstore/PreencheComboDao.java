package petstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreencheComboDao {
    
    static PreparedStatement ps;
    // a conexão com o banco de dados
    private Connection conexao;

    public PreencheComboDao() throws SQLException {
        this.conexao = new Conexao().getConexao();
    }

    public List<PreencheCombo> getListaCanina() throws SQLException {
        String sql;
        sql = "select * from animal_raca where id_especie = '1'";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<PreencheCombo> lista = new ArrayList<>();
                while (rs.next()) {
                    PreencheCombo pc = new PreencheCombo();
                    pc.setId_raca(Long.valueOf(rs.getString("id_raca")));
                    pc.setRaca(rs.getString("raca"));
                    pc.setId_especie(Long.valueOf(rs.getString("id_especie")));
                    lista.add(pc);
                }
                return lista;
            }
        }
    }
    
    public List<PreencheCombo> getListaFelina() throws SQLException {
        String sql;
        sql = "select * from animal_raca where id_especie = '2'";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<PreencheCombo> lista = new ArrayList<>();
                while (rs.next()) {
                    PreencheCombo pc = new PreencheCombo();
                    pc.setId_raca(Long.valueOf(rs.getString("id_raca")));
                    pc.setRaca(rs.getString("raca"));
                    pc.setId_especie(Long.valueOf(rs.getString("id_especie")));
                    lista.add(pc);
                }
                return lista;
            }
        }
    }
    
      public List<PreencheCombo> getListaEspecie() throws SQLException {
        String sql;
        sql = "select * from animal_especie";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<PreencheCombo> lista = new ArrayList<>();
                while (rs.next()) {
                    PreencheCombo pc = new PreencheCombo();
                    pc.setId_especie(Long.valueOf(rs.getString("id_especie")));
                    pc.setEspecie(rs.getString("Especie"));
                    lista.add(pc);
                }
                return lista;
            }
        }
    }
    
}
