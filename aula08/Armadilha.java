public class Armadilha implements Atacante {
    private final String tipo;

    public Armadilha(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo inválido");
        }
        this.tipo = tipo;
    }

    @Override
    public void atacar() {
        System.out.println("A armadilha do tipo " + tipo + " atacou!");
    }

}
