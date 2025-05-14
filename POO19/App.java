package POO19;

import POO19.Classes.Matematica;

public class App {
    public static void main(String[] args) {
        int[] numeros = new int[] { 10, 20, 30, 40 };
        int[] numeros2 = new int[] { 1, 0, 3 };
        Matematica matematica = new Matematica();
        for (int x = 0; x < 4; x++) {
            try {
                matematica.dividir(numeros[x], numeros2[x]);
                System.out.println("Mensagem após a exceção");
            }

            catch (Exception erro) {
                erro.printStackTrace();
            }
        }
    }
}