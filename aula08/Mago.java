public class Mago extends Personagem {
    public Mago(String nome, int energiaInicial) {
        super(nome, energiaInicial);
    }

    @Override
    public void atacar() {
        if (getEnergia() <= 0) {
            throw new SemEnergiaExecption("Energia insuficiente para atacar");
        } else {
        consumirEnergia(2);
        System.out.println(getNome() + " está atacando com força!");
        }
}

}
