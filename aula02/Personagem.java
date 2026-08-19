public class Personagem {


        String nome;
        int nivel;
        int vida;
        int força;
        
    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + força);
    }    
    
     void atacar(Personagem Inimigo) {
     System.out.println(nome + " atacou " + Inimigo.nome);
     Inimigo.vida = Inimigo.vida - força;
     System.out.println("Vida: " + Inimigo.vida);

      } void defender(Personagem Inimigo){
        System.out.println(Inimigo.nome + " defende_se " + nome);
        vida = vida - Inimigo.força;
        System.out.println("Vida: " + vida);
      
    }void checklife(){
        if (vida <= 0) {
            System.out.println(nome + " Se-fudeu");   
       } else{
          System.out.println(nome + " Tá vivo");
       }
       
    }


    


    }




