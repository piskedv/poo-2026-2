public class UtilPar {
    public static <K, V> String descrever(ParChaveValor<K, V> par) {
        // TODO 6: rejeitar par null e devolver "chave => valor" sem cast.
        
        if (par == null) {
            throw new IllegalArgumentException("O par não pode ser nulo");
        }

        return par.getChave() + " => " + par.getValor();
    }
}
