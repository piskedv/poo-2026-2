import java.util.Objects;

/** Testes sem bibliotecas externas. NÃO ALTERAR ESTE ARQUIVO. */
public class Testes {
    private static int passou = 0;
    private static int total = 0;

    private static void verificar(String nome, Runnable caso) {
        total++;
        try {
            caso.run();
            passou++;
            System.out.println("[OK] " + nome);
        } catch (Throwable erro) {
            System.out.println("[FALHOU] " + nome + " -> " + erro);
        }
    }

    private static void iguais(Object esperado, Object obtido) {
        if (!Objects.equals(esperado, obtido)) {
            throw new AssertionError("Esperado: " + esperado + "; obtido: " + obtido);
        }
    }

    private static void esperarErro(Class<? extends Throwable> esperado, Runnable acao) {
        try {
            acao.run();
        } catch (Throwable erro) {
            if (esperado.isInstance(erro)) return;
            throw new AssertionError("Exceção incorreta: " + erro, erro);
        }
        throw new AssertionError("Era esperada a exceção " + esperado.getSimpleName());
    }

    public static void main(String[] args) {
        verificar("P01 - String e Integer", () -> {
            ParChaveValor<String,Integer> par = new ParChaveValor<>("ano", 2026);
            iguais("ano", par.getChave());
            iguais(2026, par.getValor());
        });
        verificar("P02 - Integer e String", () -> {
            ParChaveValor<Integer,String> par = new ParChaveValor<>(101, "Lab");
            iguais(101, par.getChave());
            iguais("Lab", par.getValor());
        });
        verificar("P03 - recusa chave nula", () -> esperarErro(
            IllegalArgumentException.class, () -> new ParChaveValor<String,Integer>(null, 10)));
        verificar("P04 - recusa valor nulo", () -> esperarErro(
            IllegalArgumentException.class, () -> new ParChaveValor<String,Integer>("ok", null)));
        verificar("P05 - substitui e devolve valor anterior", () -> {
            ParChaveValor<String,Integer> par = new ParChaveValor<>("nota", 5);
            iguais(5, par.substituirValor(8));
            iguais(8, par.getValor());
            iguais("nota", par.getChave());
        });
        verificar("P06 - recusa substituição nula e preserva valor", () -> {
            ParChaveValor<String,String> par = new ParChaveValor<>("setor", "A");
            esperarErro(IllegalArgumentException.class, () -> par.substituirValor(null));
            iguais("A", par.getValor());
        });
        verificar("P07 - descreve tipos diferentes", () -> {
            iguais("ano => 2026", UtilPar.descrever(new ParChaveValor<>("ano", 2026)));
            iguais("5 => cinco", UtilPar.descrever(new ParChaveValor<>(5, "cinco")));
        });
        verificar("P08 - recusa par nulo", () -> esperarErro(
            IllegalArgumentException.class, () -> UtilPar.descrever(null)));
        System.out.println("\nRESULTADO: " + passou + "/" + total);
        if (passou != total) System.exit(1);
    }
}
