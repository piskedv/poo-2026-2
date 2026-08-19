public class Main {
    
    public static void main(String[] args) {

        Personagem mago = new Personagem();

        mago.nome = "Artur";
        mago.vida = 300;
        mago.força = 400;
        mago.nivel = 777;

        Personagem monstro = new Personagem();

        monstro.nome = "Roger";
        monstro.vida = 300;
        monstro.força = 299;
        monstro.nivel = 42;

        mago.exibirStatus();
        monstro.exibirStatus(); 
        mago.atacar(monstro);
        mago.defender(monstro);
        monstro.checklife();
        mago.checklife();
    }
}

