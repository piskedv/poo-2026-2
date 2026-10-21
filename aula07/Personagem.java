package aula07;

public abstract class Personagem implements Atacante {
    private final String nome;
    
    
    public Personagem(String nome) {
        this.nome = nome;
    }
        
    public String getNome() {
        return nome;
        }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ".");
    }

    public abstract void atacar();
}