public class Main{


public static void main(String[] args) {

    Personagem guerreiro = new Personagem("Piske o Conquistador", 100, 25, 2);
    Personagem inimigo = new Personagem("Roger o Rato", 60 , 10 , 2);
    Personagem mago = new Personagem("João o Feiticeiro", 80, 15, 2);

      guerreiro.exibirStatus();
        inimigo.exibirStatus();
        mago.exibirStatus();

        Arma espada = new Arma("Graveto", 5);
        Arma machado = new Arma("Machado do Kratos", 50);
        Arma cajado = new Arma("Cajado do Merlin", 45);
        Habilidade cegueira = new Habilidade("Encantamento Antigo", 1000)

        espada.exibirStatus();
        machado.exibirStatus();
        cajado.exibirStatus();

        inimigo.equipar(espada);
        guerreiro.equipar(machado);
        mago.equiparHabilidade(cegueira);

    }
}