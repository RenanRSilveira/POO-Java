package POO12.Jogo;

public final class Farm extends Personagem {
    private String arma;

    public Farm(String nome) {
        super(nome);
        setClasse("Farm");
        this.arma = "Lança";
    }

    @Override
    public String toString() {
        String data = super.toString();
        data += String.format("Arma: %s\n", arma);
        return data;
    }

    @Override
    public void atacarComArma() {
        System.out.println("Atacou com arma");
    }
}
