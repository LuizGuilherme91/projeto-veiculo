public class Carros extends Veiculo{
    private Integer motorizacao_cv;
    private Integer qtde_marcha;
    private String opcionais;

    public Carros() {}

    public Carros(String nome, Integer ano, Integer modelo, String cor, String placa, Boolean unico_dono, Integer motorizacao_cv, Integer qtde_marcha, String opcionais) {
        this.motorizacao_cv = motorizacao_cv;
        this.qtde_marcha = qtde_marcha;
        this.opcionais = opcionais;
    }

    public Integer getMotorizacao_cv() {
        return motorizacao_cv;
    }
    public void setMotorizacao_cv(Integer motorizacao_cv) {
        this.motorizacao_cv = motorizacao_cv;
    }

    public Integer getQtde_marcha() {
        return qtde_marcha;
    }
    public void setQtde_marcha(Integer qtde_marcha) {
        this.qtde_marcha = qtde_marcha;
    }

    public String getOpcionais() {
        return opcionais;
    }
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    
    @Override
    public void salvar() {
        System.out.println("Carro salvo com sucesso");
        super.salvar();
    }

    public void alterar() {
        System.out.println("Carro alterado com sucesso");
    }
    public void excluir() {
        System.out.println("Carro excluído com sucesso");
    }

}
