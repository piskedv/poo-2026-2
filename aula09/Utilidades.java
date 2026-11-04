package aula09;

public class Utilidades {
    public static <T> T escolherSeNaoNulo(T principal, T reserva) {
    
       if (principal != null) {
        return principal;
    }
        if (reserva != null) {
        return reserva;
    }
        throw new IllegalArgumentException("Ambos os valores são nulos");
        
    }
}