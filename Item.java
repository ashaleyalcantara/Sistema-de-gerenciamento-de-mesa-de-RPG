public class Item {

    private static int contadorId = 0;

    private int id;
    private String nome;
    private String tipo;

    public Item(String nome, String tipo) {
        this.id = ++contadorId;
        setNome(nome);
        setTipo(tipo);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome do item não pode ser nulo ou vazio.");
        } else {
            this.nome = nome;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            System.out.println("Tipo do item não pode ser nulo ou vazio.");
        } else {
            this.tipo = tipo;
        }
    }

}