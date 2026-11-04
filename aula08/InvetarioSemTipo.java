import java.util.ArrayList;
import java.util.List;

public class InvetarioSemTipo<T> {
    private final List<T> itens = new ArrayList<>();

    public void guardar(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }
        itens.add(item);
    }  

    public T pegar(int posicao) {
        return itens.get(posicao);
    }
    
    public int quantidade() {
        return itens.size();
    }
}
