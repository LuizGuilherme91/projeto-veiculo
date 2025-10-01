public class Veiculo extends ClasseGenerica{
    private Integer ano;
    private Integer modelo;
    private String cor;
    private String placa;
    private Boolean unico_dono;

    public Veiculo() {}

    public Veiculo(String nome, Integer ano, Integer modelo, String cor, String placa, Boolean unico_dono) {
        super(nome);
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.unico_dono = unico_dono;
    }

    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getModelo() {
        return modelo;
    }
    public void setModelo (Integer modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Boolean getUnico_dono() {
        return unico_dono;
    }
    public void setUnico_dono(Boolean unico_dono) {
        this.unico_dono = unico_dono;
    }

    public void salvar() {
        System.out.println("Veículo salvo com sucesso");
    }
    public void alterar() {
        System.out.println("Veículo alterado com sucesso");
    }
    public void excluir() {
        System.out.println("Veículo excluído com sucesso");
    }

}
