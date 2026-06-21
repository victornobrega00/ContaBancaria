package review;

import conta.bancaria.Cliente;

public class ValidadorDocumentos {
    private Cliente cliente;

    private static int calcularDigito(String str, int peso){
        int soma = 0;
        int indice = str.length() -1;

        while(indice >= 0){
            soma += Character.getNumericValue(str.charAt(indice)) * peso;
            peso = (peso < 9) ? peso + 1 : 2;
            indice--;
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }

    public static boolean isCPF(Cliente cliente) throws CPFInvalidoException{
        if(cliente.getCpf() == null) return false;
        cliente.setCpf(cliente.getCpf().replace("\\D", " "));
        if(cliente.getCpf().length() != 11 || cliente.getCpf().matches("(\\d)\\1{10}")) return false;

        try{
            int dig1 = calcularDigito(cliente.getCpf().substring(0, 9), 10);
            int dig2 = calcularDigito(cliente.getCpf().substring(0, 9) + dig1, 11);
            return cliente.getCpf().equals(cliente.getCpf().substring(0, 9) + dig1 + dig2);
        } catch (CPFInvalidoException e) {
            System.out.println(e.getMensagem());
            return false;
        }
    }

    public static boolean isCNPJ(Cliente cliente){
        if(cliente.getCnpj() == null) return false;
        cliente.setCnpj(cliente.getCnpj().replace("\\D", " "));
        if (cliente.getCnpj().length() != 14 || cliente.getCnpj().matches("(\\d)\\1{13}")) return false;

        try{
            int dig1 = calcularDigito(cliente.getCnpj().substring(0, 12), 5);
            int dig2 = calcularDigito(cliente.getCnpj().substring(0, 12) + dig1, 6);
            return cliente.getCnpj().equals(cliente.getCnpj().substring(0, 12) + dig1 + dig2);
        } catch (Exception e) {
            return false;
        }
    }
}
