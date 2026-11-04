public class Pocao {
    private String nome;
    private int recuperacao;

    public Pocao(String nome, int recuperacao) {
        if (nome == null || nome.isEmpty() || recuperacao <= 0) {
            throw new IllegalArgumentException("Nome ou recuperação inválido");
        }
        this.nome = nome;
        this.recuperacao = recuperacao;
    }

    public String getNome() {
        return nome;
    }
    public int getRecuperacao() {
        return recuperacao;
    }

    @Override
    public String toString() {
        return "Pocao{" +
                "nome='" + nome + '\'' +
                ", recuperacao=" + recuperacao +
                '}';
    }
}
