package saldo.cliente;

import conta.bancaria.Cliente;

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

}
