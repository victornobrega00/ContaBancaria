package saldo.cliente;

import conta.bancaria.Cliente;

public class RemoverSaldo {
    private Saldo saldo;

    public RemoverSaldo() {}

    private void removerSaldo(Saldo saldo, double saldoRemovido){
        saldo.setSaldo(saldo.getSaldo() - saldoRemovido);
        if (saldoRemovido > saldo.getSaldo()){
            throw new ValorInsuficienteNaContaExecption("Saldo Insuficiente!");
        }
    }
}
