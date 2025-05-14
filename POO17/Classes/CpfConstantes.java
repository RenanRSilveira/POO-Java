package POO17.Classes;

public final class CpfConstantes {
    public static final int INDICE_REGIAO_CPF = 8;
    public static final int INDICE_PRIMEIRO_VERIFICADOR = 9;
    public static final int INDICE_SEGUNDO_VERIFICADOR = 10;

    // construtor privado impede a criação de objetos
    private CpfConstantes() {
    }

    public String toString() {
        System.out.println(INDICE_PRIMEIRO_VERIFICADOR);
        System.out.println(INDICE_SEGUNDO_VERIFICADOR);
        System.out.println(INDICE_REGIAO_CPF);
        return null;
    }
}
