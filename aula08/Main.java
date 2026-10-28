public class Main {
    public static void main(String[] args) {

        try {
            Atacante[] atacantes = {
                new Torre("Torre do mal"),
                new Armadilha("Armadilha do mal"),
                new Guerreiro("Guerreiro do mal", 10),
                new Mago("Mago do mal", 5),
                new Arqueiro("Arqueiro do BEM", 0)
            };

           for (Atacante item : atacantes) {
                item.atacar();
            }
        } catch (SemEnergiaExecption erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
            



    }
}