public class Mago extends Personagem {
    
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
       System.out.println(getNome() + " está atacando com magia!");
        }
}