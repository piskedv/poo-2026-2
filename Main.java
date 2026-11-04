public class Main {
    public static void main(String[] args) {
        ParChaveValor<String, Integer> matricula = new ParChaveValor<>("matrícula", 2026);
        ParChaveValor<Integer, String> sala = new ParChaveValor<>(101, "Laboratório");

        System.out.println(UtilPar.descrever(matricula));
        System.out.println(UtilPar.descrever(sala));

        Integer antigo = matricula.substituirValor(2027);
        System.out.println("Matrícula anterior: " + antigo);
        System.out.println("Nova matrícula: " + matricula.getValor());

        // Observe a segurança de tipos (descomente e tente compilar):
        // matricula.substituirValor("dois mil e vinte e oito");
    }
}
