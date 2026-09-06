import java.time.LocalDate; 

public class Sessao {

    private static int contadorId = 0;

    private int id;
    private LocalDate data;
    private String descricao;

    public Sessao(LocalDate data, String descricao) {
        this.id = ++contadorId;
        setData(data);
        setDescricao(descricao);
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data == null) {
            System.out.println("Data não pode ser nula.");
            return;
        }
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            System.out.println("Descrição não pode ser nula ou vazia.");
            return;
        }
        this.descricao = descricao;
    }
}