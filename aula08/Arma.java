public class Arma {
    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        if (nome == null || nome.isEmpty() || dano <= 0) {
            throw new IllegalArgumentException("Nome ou dano inválido");
        }
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    @Override 
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", dano=" + dano +
                '}';
    }
}
