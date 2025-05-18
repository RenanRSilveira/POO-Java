package POO05.exemplo;

public class ContaNetflix {
    String resolucao, idioma;

    void entrar() {
        preferenciaIdioma();
        identificarResolucao();
    }

    void preferenciaIdioma() {
        idioma = "PT-BR";
    }

    void identificarResolucao() {
        resolucao = "FULL HD";
    }

    void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução " + resolucao);
        carregarAudioFilme();
    }

    void carregarAudioFilme() {
        if (idioma.equals("PT-BR")) {
            System.out.println("Carregando o áudio em " + idioma);
        } else {
            System.out.println("Carregando o áudio em EN-US");
        }
    }
}
