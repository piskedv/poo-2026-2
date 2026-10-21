package aula07;

public class Armadilha implements Atacante {
    private final String indentificacao;

    public Armadilha(String indentificacao) {
        this.indentificacao = indentificacao;
    }

    @Override
    public void atacar() {
        System.out.println(indentificacao + " está atacando com uma armadilha!");
    }
    
}
