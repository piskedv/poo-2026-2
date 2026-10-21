package aula07;

public class Main {
    public static void main(String[] args) {
        
          Atacante[] atacantes = {
           new Torre("Torre do mal"), 
           new Armadilha("Armadilha do mal"),
           new Guerreiro ("Guerreiro do mal"),
           new Mago ("Mago do mal"),
           new Arqueiro ("Arqueiro do BEM")
          };

          for (Atacante item : atacantes) {
            item.atacar();
          }
    }

}