package exceptions;

public class LivroInvalidoException extends Exception{

    public LivroInvalidoException(String message) {
        super(message);
    }

    public LivroInvalidoException() {
        super(); // Chama o construtor da superclasse sem mensagem
    }
}
