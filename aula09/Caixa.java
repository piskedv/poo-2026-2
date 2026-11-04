package aula09;

    public class Caixa<T> {

    private T valor;

    public Caixa(T valor) {
        if (valor == null) {
            throw new IllegalArgumentException("O valor inicial não pode ser nulo");
        }

        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void alterar(T novoValor) {
        if (novoValor == null) {
            throw new IllegalArgumentException("O novo valor não pode ser nulo");
        }

        this.valor = novoValor;
    }
    
    }

