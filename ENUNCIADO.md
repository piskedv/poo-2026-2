# Missão 2 — Chave e valor de tipos independentes (30 min)

**Modo:** individual ou com consulta ao colega | **Dificuldade:** intermediária | **Meta:** 8/8 em `TestesPar`.

## Problema

Uma aplicação precisa representar informações como `"matrícula" -> 2026` ou `101 -> "Laboratório"`. A chave e o valor podem ter tipos diferentes, mas cada objeto deve preservar seus tipos após criado.

## Requisitos

**A. Classe `ParChaveValor<K,V>`**
1. Implementar dois campos `private`: uma chave de tipo `K`, um valor de tipo `V`.
2. Construtor `ParChaveValor(K chave, V valor)` rejeita `null` em qualquer argumento com `IllegalArgumentException`.
3. `getChave()` retorna a chave e `getValor()` retorna o valor.
4. `substituirValor(V novoValor)` rejeita `null`, atualiza o valor e retorna o **valor anterior**.
5. A chave não pode ser alterada após criar o objeto.

**B. Método genérico**
6. Implementar `UtilPar.descrever(ParChaveValor<K,V> par)` como método genérico estático.
7. Se `par == null`, lançar `IllegalArgumentException`.
8. Retornar uma `String` no formato `chave => valor` usando os getters, sem cast.

## Demonstração no `Main`

- Criar `ParChaveValor<String,Integer>` e `ParChaveValor<Integer,String>`.
- Mostrar a chave, o valor, o resultado de substituição e o resumo.
- Explicar por que o compilador rejeita `par1.substituirValor("texto")` se `par1` possui valor `Integer`.

## Critérios de conclusão

A classe compila, imprime os exemplos e `java Testes` mostra **8/8**.

**Arquivos que você altera:** `ParChaveValor.java`, `UtilPar.java` e, se necessário, `Main.java`. Não alterar os testes.
