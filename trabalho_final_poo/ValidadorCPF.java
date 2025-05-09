
public class ValidadorCPF {

    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^\\d]", "");
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) return false;

        try {
            int soma1 = 0, soma2 = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Character.getNumericValue(cpf.charAt(i));
                soma1 += digito * (10 - i);
                soma2 += digito * (11 - i);
            }

            int verificador1 = soma1 * 10 % 11;
            verificador1 = (verificador1 == 10) ? 0 : verificador1;

            soma2 += verificador1 * 2;
            int verificador2 = soma2 * 10 % 11;
            verificador2 = (verificador2 == 10) ? 0 : verificador2;

            return verificador1 == Character.getNumericValue(cpf.charAt(9)) &&
                   verificador2 == Character.getNumericValue(cpf.charAt(10));
        } catch (Exception e) {
            return false;
        }
    }
}
