public class Mestre {

    private static int contadorId = 0;

    private int id;
    private String nome;

    public Mestre(String nome) {
        this.id = ++contadorId;
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome do mestre não pode ser nulo ou vazio.");
            return;
        }
        this.nome = nome;
    }

    public String narrar(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty()) {
            return "Mestre " + this.nome + " não tem nada a narrar.";
        }
        return "Mestre " + this.nome + ": " + mensagem;
    }
}