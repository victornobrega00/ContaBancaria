package validador;

public class CredenciaisInvalidasException extends RuntimeException {
    private String mensagem;
    public CredenciaisInvalidasException(String mensagem) {
        super(mensagem);
    }
}
