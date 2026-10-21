package aula07;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando com força!");
    }
}