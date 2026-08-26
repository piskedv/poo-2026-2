public class Habilidade {
    
String nome;
    int dano;

    Habilidade(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    void exibirStatus() {
        System.out.println("Nome: " + nome);
    }

    
}    
 
