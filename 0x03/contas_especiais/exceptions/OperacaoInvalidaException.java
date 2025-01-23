package exceptions;

public class OperacaoInvalidaException extends Exception{

    public OperacaoInvalidaException(String message) {
        super(message);
    }

    public OperacaoInvalidaException() {
        super(); // Chama o construtor da superclasse sem mensagem
    }
}
