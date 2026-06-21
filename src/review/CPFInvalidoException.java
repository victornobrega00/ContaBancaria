package review;

public class CPFInvalidoException extends RuntimeException {
    private String mensagem;
    public CPFInvalidoException(String mensagem) {
         super(mensagem);
    }

    public String getMensagem() {
        return mensagem;
    }
}
