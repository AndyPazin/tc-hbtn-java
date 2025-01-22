package exceptions;

public class AutorInvalidoException extends Exception {

    public AutorInvalidoException(String message) {
        super(message);
    }

    public AutorInvalidoException() {
        super(); // Chama o construtor da superclasse sem mensagem
    }
}
