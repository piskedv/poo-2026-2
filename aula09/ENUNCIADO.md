# Missão 1 — Uma caixa que respeita o tipo

**Modo:** individual | **Dificuldade:** introdutória | **Meta:** 8/8 em `TestesFixacao`.

## Problema

Uma caixa guarda um conteúdo, mas precisamos impedir trocas por tipos incompatíveis e validar conteúdo nulo. A mesma classe precisa funcionar para `String` e `Integer`.

## Requisitos

**A. Classe `Caixa<T>`**
1. Guardar um valor privado do tipo `T`.
2. Receber o conteúdo inicial pelo construtor `Caixa(T valor)`.
3. Recusar conteúdo inicial `null`, lançando `IllegalArgumentException`.
4. Retornar o valor em `getValor()`.
5. Permitir substituir por `alterar(T novoValor)`, recusando `null` e preservando o valor anterior em caso de erro.

**B. Método genérico na classe `Utilidades`**
6. Implementar `public static <T> T escolherSeNaoNulo(T principal, T reserva)`.
7. Se `principal` for diferente de `null`, retornar `principal`; caso contrário, usar `reserva`.
8. Se ambos forem `null`, lançar `IllegalArgumentException`.

## Experimente

- Crie `Caixa<String>` e `Caixa<Integer>` no `Main`.
- Tente descomentar a linha que passa uma `String` para uma `Caixa<Integer>` e observe o erro **na compilação**. Depois, comente a linha novamente.
- Execute `TestesFixacao`: corrija até obter **8/8**.

## Perguntas para responder ao professor

- Onde o tipo concreto da caixa é definido?
- O que o `<T>` antes de `T escolherSeNaoNulo(...)` significa?
- Por que o valor antigo não muda quando tentam alterá-lo para `null`?

**Arquivos que você altera:** `Caixa.java`, `Utilidades.java` e, se quiser, `Main.java`. Não alterar o arquivo de testes.
