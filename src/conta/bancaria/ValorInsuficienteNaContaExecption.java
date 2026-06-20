package conta.bancaria;

public class ValorInsuficienteNaContaExecption extends RuntimeException {
    private String mensagem;
    public ValorInsuficienteNaContaExecption(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
