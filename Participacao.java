import java.time.LocalDate; 

public class Participacao {
    
    private String papel;
    private LocalDate dataEntrada;

    public Participacao(String papel, LocalDate dataEntrada) {
        setPapel(papel);
        setDataEntrada(dataEntrada);
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        if (papel == null || papel.trim().isEmpty()) {
            System.out.println("Papel não pode ser nulo ou vazio.");
            return;
        }
        this.papel = papel;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        if (dataEntrada == null) {
            System.out.println("Data de entrada não pode ser nula.");
            return;
        }
        this.dataEntrada = dataEntrada;
    }
    
}
