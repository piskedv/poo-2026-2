package aula09;

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
        verificar("F01 - caixa String", () -> iguais("Olá", new Caixa<>("Olá").getValor()));
        verificar("F02 - caixa Integer", () -> iguais(42, new Caixa<>(42).getValor()));
        verificar("F03 - atualização", () -> {
            Caixa<Integer> caixa = new Caixa<>(1);
            caixa.alterar(5);
            iguais(5, caixa.getValor());
        });
        verificar("F04 - rejeita inicial nulo", () -> esperarErro(
            IllegalArgumentException.class, () -> new Caixa<String>(null)));
        verificar("F05 - rejeita troca nula e preserva valor", () -> {
            Caixa<String> caixa = new Caixa<>("antes");
            esperarErro(IllegalArgumentException.class, () -> caixa.alterar(null));
            iguais("antes", caixa.getValor());
        });
        verificar("F06 - escolhe o principal", () -> iguais("A",
            Utilidades.escolherSeNaoNulo("A", "B")));
        verificar("F07 - usa reserva quando principal nulo", () -> iguais(9,
            Utilidades.escolherSeNaoNulo(null, 9)));
        verificar("F08 - dois valores nulos são inválidos", () -> esperarErro(
            IllegalArgumentException.class, () -> Utilidades.<String>escolherSeNaoNulo(null, null)));
        System.out.println("\nRESULTADO: " + passou + "/" + total);
        if (passou != total) System.exit(1);
    }
}
