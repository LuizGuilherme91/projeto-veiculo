public class Garagem extends ClasseGenerica{
    private String cidade;

    public Garagem() {}

    public Garagem(String nome, String cidade) {
        super(nome);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public void salvar() {
        System.out.println("Garagem salva com sucesso");
    }
    public void alterar() {
        System.out.println("Garagem alterada com sucesso");
    }
    public void excluir() {
        System.out.println("Garagem excluída com sucesso");
    }

}
