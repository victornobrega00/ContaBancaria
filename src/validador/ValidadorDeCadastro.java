package validador;

import conta.bancaria.Cliente;

public class ValidadorDeCadastro {
    private Cliente cliente;

    public ValidadorDeCadastro() {
    }

    public void validarCadastro(String email, String senha){
        if(email == null || email.equalsIgnoreCase(cliente.getEmail()) ){
            throw new CredenciaisInvalidasException("E-mail ou senha incorretos!");
        }

        if (senha == null ||senha.equals(cliente.getSenha())) {
            throw new CredenciaisInvalidasException("E-mail ou senha incorretos.");
        }

        System.out.println("Usuário validado com sucesso!");
    }
}
