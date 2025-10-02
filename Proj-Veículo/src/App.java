public class App {
    public static void main(String[] args) throws Exception {
        Garagem garem1 = new Garagem("Garagem do João", "São Paulo");
        garem1.salvar();

        Categoria cat1 = new Categoria("Categoria A e B");
        cat1.salvar();

        Carros carro1 = new Carros("Carro do João", 2020, 2020, "Preto", "ABC-1234", true, 150, 5, "Ar condicionado, Direção hidráulica");
        carro1.salvar();

        Motos moto1 = new Motos("Moto da Maria", 2021, 2021, "Vermelha", "XYZ-5678", false, 600);
        moto1.salvar();

    }

}
