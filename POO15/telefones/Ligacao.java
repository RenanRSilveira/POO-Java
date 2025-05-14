package POO15.telefones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    private String numeroOrigem, numeroDestino, horarioLigacao;

    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }

    public void ligar() {
        System.out.println("Ligando para " + numeroDestino);
        System.out.println("Chamando...");
        System.out.println("Ocupado.");
        DateTimeFormatter formadorData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime horaAgora = LocalDateTime.now();
        horarioLigacao = formadorData.format(horaAgora);

    }

    public String toString() {
        return String.format("Origem: %s\tDestinho: %s\tHorário: %s\n",
                numeroOrigem,
                numeroDestino,
                horarioLigacao);
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public String getHorarioLigacao() {
        return horarioLigacao;
    }

    public void setHorarioLigacao(String horarioLigacao) {
        this.horarioLigacao = horarioLigacao;
    }

}
