public class Cliente {


     public String nome;
     private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirStatus() {
        System.out.println("\n====== STATUS ======");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone pra contato: " + telefone);
    }


}

    