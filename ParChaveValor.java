/** MISSÃO 2: uma chave de tipo K e um valor de tipo V. */
public class ParChaveValor<K, V> {
    private final K chave;
    private V valor;

    public ParChaveValor(K chave, V valor) {
        // TODO 2: rejeitar null e inicializar os campos.
        if (chave == null || valor == null) {
            throw new IllegalArgumentException("Nenhum dos valores pode ser nulo");
        }
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        // TODO 3: retornar a chave.
        return this.chave;
    }

    public V getValor() {
        // TODO 4: retornar o valor.
        return this.valor;
    }

    public V substituirValor(V novoValor) {
        // TODO 5: rejeitar null; atualizar; devolver o VALOR ANTIGO.
        if (novoValor == null) {
            throw new IllegalArgumentException("O novo valor não pode ser nulo");
        }
        V valorAntigo = this.valor;
        this.valor = novoValor;
        return valorAntigo;
    }
}
    

