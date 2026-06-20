package conta.bancaria;

public class AdicionarSaldo {
    private Saldo saldo;
    private Cliente cliente;

    public AdicionarSaldo() {
    }

    public AdicionarSaldo(Saldo saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void adicionarSaldo(Saldo saldo, double saldoIncerido){
        saldo.setSaldo(saldoIncerido + saldo.getSaldo());
    }

    public void removerSaldo(Saldo saldo, double saldoRemovido){
        saldo.setSaldo(saldoRemovido - saldo.getSaldo());
        if (saldo.getSaldo() < saldoRemovido){
            throw new ValorInsuficienteNaContaExecption("Saldo Insuficiente!");
        }

    }
}
