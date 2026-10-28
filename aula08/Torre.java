public class Torre implements Atacante {
    private String local;

    public Torre(String local) {
        if (local == null || local.isEmpty()) {
            throw new IllegalArgumentException("Local inválido");
        }
        this.local = local;
    }

    @Override
    public void atacar() {
        System.out.println(local + " Jogando flechas!");
    }
    
    public String getLocal() {
        return local;
    }
}
