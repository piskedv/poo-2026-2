public class Personagem {
    String nome;
    int vida;
    int forca;
    int nivel;
    Habilidade Habilidade;

    Personagem(String nome, int vida, int forca, int nivel){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.nivel = nivel;
    }

    void exibirStatus(){
        System.out.println("Nome" + nome);
        System.out.println("Vida" + vida);
        System.out.println("Força" + forca);
        System.out.println("Nível" + nivel);
    }  

    void equipar(Arma novaArma) {
        Arma = novaArma;
        System.out.println(nome + " Equipou: " + Arma.nome);
    }

    void equiparHabilidade(Habilidade novaHabilidade) {
        Habilidade = novaHabilidade;
        System.out.println(nome + " Usou " + novaHabilidade);
    }
        void atacar(Personagem alvo) {
        int danoTotal = forca;
        if (Arma != null) {
            danoTotal += Arma.dano;
        }
        alvo.vida -= danoTotal;

        alvo.receberDano(danoTotal);


        System.out.println(nome + " deu dano: " + alvo.nome);
        System.out.println("Tomou isso: " + danoTotal);
        System.out.println(alvo.nome + " ficou " + alvo.vida + " com isso de vida");
    }

    void receberDano(int dano) {
        vida -= dano;
        if (!estaVivo()) {
            System.out.println(nome + " Acabado verme.");
        }
        System.out.println(nome + " tomou " + dano + " dano");
        System.out.println("Calmou, sua vida: " + vida);
    }

    boolean estaVivo() {
        return vida > 0;
    }
}

