public class Main {
    public static void main(String[] args) {

        Invetario<Arma> arsenal = new Invetario<>();
        arsenal.guardar(new Arma("Espada", 10));
        arsenal.guardar(new Arma("Machado", 15));

        Invetario<Pocao> bolsa = new Invetario<>();
        bolsa.guardar(new Pocao("Poção de Vida", 20));

        Arma armaAtual = arsenal.pegar(0);
        Pocao pocaoAtual = bolsa.pegar(0);

        System.out.println("Arma atual: " + armaAtual.getNome());
        System.out.println("Poção atual: " + pocaoAtual.getNome());
        System.out.println("Dano da arma: " + arsenal.quantidade());


    }

}