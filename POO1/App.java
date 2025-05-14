package POO1;

public class App {
    public static void main(String[] args) {
        // iPhone 12, tela 6.1", 256 GB
        // Galaxy Note 12 Ultra, tela 6.9", 256 GB
        // Mi 11 Pro, tela 6.81", 128 GB

        // Objeto do tipo Celular = Instância
        Celular celularA = new Celular();
        celularA.nome = "iPhone 12";
        celularA.tela = 6.1f;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "iOs";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 12 Ultra";
        celularB.tela = 6.9f;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        System.out.printf("Celular %s com tela de %.2f, %d GB e SO %s\n", celularA.nome, celularA.tela,
                celularA.armazenamento, celularA.sistemaOperacional);

        System.out.printf("Celular %s com tela de %.2f, %d GB e SO %s", celularB.nome, celularB.tela,
                celularB.armazenamento, celularB.sistemaOperacional);
    }
}