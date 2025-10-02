public class Motos extends Veiculo{
    private Integer cilindrada;

    public Motos() {}

    public Motos(String nome, Integer ano, Integer modelo, String cor, String placa, Boolean unico_dono, Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }


    
    @Override
    public void salvar() {
        System.out.println("Moto salva com sucesso");
        super.salvar();
    }

    public void alterar() {
        System.out.println("Moto alterada com sucesso");
    }
    public void excluir() {
        System.out.println("Moto excluída com sucesso");
    }
}
