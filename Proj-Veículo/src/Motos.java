public class Motos {
    private Integer cilindrada;

    public Motos() {}

    public Motos(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void salvar() {
        System.out.println("Moto salva com sucesso");
    }
    public void alterar() {
        System.out.println("Moto alterada com sucesso");
    }
    public void excluir() {
        System.out.println("Moto excluída com sucesso");
    }
}
