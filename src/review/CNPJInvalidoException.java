package review;

public class CNPJInvalidoException extends RuntimeException {
    private String mensagem;
    public CNPJInvalidoException(String mensagem) {
        super(mensagem);
    }

    public String getMensagem() {
        return mensagem;
    }
}
