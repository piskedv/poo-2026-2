package aula09;

public class Main {
    public static void main(String[] args) {
        // Depois de completar a classe Caixa, estas linhas funcionarão.
        Caixa<String> saudacao = new Caixa<>("Bom dia");
        Caixa<Integer> pontos = new Caixa<>(10);
        System.out.println(saudacao.getValor());
        System.out.println(pontos.getValor());

        saudacao.alterar("Boa tarde");
        pontos.alterar(15);
        System.out.println("Depois da alteração: " + saudacao.getValor());
        System.out.println("Pontos: " + pontos.getValor());

        String resposta = Utilidades.escolherSeNaoNulo(null, "Plano B");
        System.out.println("Resposta: " + resposta);

        // DESAFIO: descomente e tente compilar; depois comente de novo.
        // pontos.alterar("quinze");
    }
}
