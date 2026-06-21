package review;

public final class ValidadorDocumentos {

    private ValidadorDocumentos() {
        throw new AssertionError("Classe utilitária não deve ser instanciada.");
    }

    private static int calcularDigito(String str, int peso) {
        int soma = 0;
        int indice = str.length() - 1;

        while (indice >= 0) {
            soma += Character.getNumericValue(str.charAt(indice)) * peso;
            peso = (peso < 9) ? peso + 1 : 2;
            indice--;
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }
    public static boolean isCPF(String cpf) {
        if (cpf == null) return false;
        String cpfLimpo = cpf.replaceAll("\\D", "");
        if (cpfLimpo.length() != 11 || cpfLimpo.matches("(\\d)\\1{10}")) {
            return false;
        }
        int dig1 = calcularDigito(cpfLimpo.substring(0, 9), 10);
        int dig2 = calcularDigito(cpfLimpo.substring(0, 9) + dig1, 11);
        return cpfLimpo.equals(cpfLimpo.substring(0, 9) + dig1 + dig2);
    }

    public static boolean isCNPJ(String cnpj) {
        if (cnpj == null) return false;
        String cnpjLimpo = cnpj.replaceAll("\\D", "");
        if (cnpjLimpo.length() != 14 || cnpjLimpo.matches("(\\d)\\1{13}")) {
            return false;
        }
        int dig1 = calcularDigito(cnpjLimpo.substring(0, 12), 5);
        int dig2 = calcularDigito(cnpjLimpo.substring(0, 12) + dig1, 6);
        return cnpjLimpo.equals(cnpjLimpo.substring(0, 12) + dig1 + dig2);
    }
}