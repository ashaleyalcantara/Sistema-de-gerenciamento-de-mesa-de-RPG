import java.time.LocalDate;

public class Participacao {
    private Jogador jogador; //Adicionamos um atributo jogador para a participação juntamente com seus métodos para representar a relação bilateral existente no diagrama 
    private String papel;
    private LocalDate dataEntrada;

    public Participacao(Jogador jogador, String papel, LocalDate dataEntrada) {
        setJogador(jogador);
        setPapel(papel);
        setDataEntrada(dataEntrada);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        if (jogador == null) {
            System.out.println("Jogador não pode ser nulo.");
        } else {
            this.jogador = jogador;
        }
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        if (papel == null || papel.trim().isEmpty()) {
            System.out.println("Papel não pode ser nulo ou vazio.");
        } else {
            this.papel = papel;
        }
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        if (dataEntrada == null) {
            System.out.println("Data de entrada não pode ser nula.");
        } else {
            this.dataEntrada = dataEntrada;
        }
    }
}