public abstract class Personagem implements Atacante {
    private String nome;
    private int energia;

    public Personagem(String nome, int energiaInicial) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (energiaInicial < 0) {
            throw new IllegalArgumentException("Energia inválida");
        }
        this.nome = nome;
        this.energia = energiaInicial;
    }

        public String getNome() {
            return nome;
        }

        public int getEnergia() {
            return energia;
        }

        protected final void consumirEnergia(int custo) throws SemEnergiaExecption {
            if (energia < custo) {
                throw new IllegalArgumentException("Energia insuficiente para realizar a ação");
            }
            if (energia < custo) {
                throw new SemEnergiaExecption("Energia insuficiente para realizar a ação");
            }
            energia -= custo;
        }

}
