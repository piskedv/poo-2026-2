package aula07;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando com arco e flecha!");
    }
}