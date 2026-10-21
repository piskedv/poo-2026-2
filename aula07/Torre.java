package aula07;

public class Torre implements Atacante {
     private final String indentificacao;

    public Torre(String indentificacao) {
        this.indentificacao = indentificacao;
    }

    @Override
    public void atacar() {
        System.out.println(indentificacao + " Jogando flechas!");
    }
    
}
