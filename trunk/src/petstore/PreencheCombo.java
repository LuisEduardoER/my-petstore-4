package petstore;

public class PreencheCombo {
    //Classe que contém o construtor, getters e setters.

    private Long id_raca;
    private String raca;
    private Long id_especie_raca;
    private Long id_especie;
    private String especie;

    public Long getId_especie_raca() {
        return id_especie_raca;
    }

    public void setId_especie_raca(Long id_especie_raca) {
        this.id_especie_raca = id_especie_raca;
    }

    public Long getId_especie() {
        return id_especie;
    }

    public void setId_especie(Long id_especie) {
        this.id_especie = id_especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Long getId_raca() {
        return id_raca;
    }

    public void setId_raca(Long id_raca) {
        this.id_raca = id_raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
