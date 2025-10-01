public class ClasseGenerica {
    private String nome;

    public ClasseGenerica() {}

    public ClasseGenerica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void salvar() {
        System.out.println("Classe Generica salvo com sucesso");
    }
    public void alterar() {
        System.out.println("Classe Generica alterado com sucesso");
    }
    public void excluir() {
        System.out.println("Classe Generica excluído com sucesso");
    }
}
