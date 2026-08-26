public class Armadura {

    String nome;
    int defesa;

    Armadura(String nome, int defesa) {
        this.nome = nome;
        this.defesa = defesa;
    }

    void exibirStatus() {
        System.out.println("Nome: " + nome);
    }
    
}
