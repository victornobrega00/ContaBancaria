package review;

public class CPFInvalidoException extends Exception {
    private String mensagem;
    public CPFInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
