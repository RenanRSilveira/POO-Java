package POO17.Classes;

public class Cpf {

    public void validar(String cpf) {
        int regiao = cpf.charAt(CpfConstantes.INDICE_REGIAO_CPF);
        int primeiroDigitoVerificador = cpf.charAt(CpfConstantes.INDICE_PRIMEIRO_VERIFICADOR);
        int segundoDigitoVerificador = cpf.charAt(CpfConstantes.INDICE_SEGUNDO_VERIFICADOR);

        System.out.println(regiao + primeiroDigitoVerificador + segundoDigitoVerificador);
    }

}
