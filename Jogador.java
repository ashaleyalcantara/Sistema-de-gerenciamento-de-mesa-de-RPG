import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private static int contadorId = 0;

    private int id;
    private String nome;
    private List<Personagem> personagens;
    private List<Participacao> participacoes; /*Adicionamos uma lista de participações para o jogador juntamente com seus métodos para representar a relação bilateral
                                                existente no diagrama  */

    public Jogador(String nome) {
        this.id = ++contadorId;
        setNome(nome);
        this.personagens = new ArrayList<>();
        this.participacoes = new ArrayList<>();
    }

    public int getId() { return id; }

    public String getNome() { return nome; }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome do jogador não pode ser nulo ou vazio.");
        } else {
            this.nome = nome;
        }
    }

    public void adicionarPersonagem(Personagem personagem) {
        if (personagem == null) {
            System.out.println("Personagem não pode ser nulo.");
        } else {
            this.personagens.add(personagem);
        }
    }

    public Personagem buscarPersonagem(int id) {
        for (Personagem personagem : this.personagens) {
            if (personagem.getId() == id) return personagem;
        }
        return null;
    }

    public List<Personagem> listarPersonagens() {
        return personagens;
    }

    public boolean removerPersonagem(int id) {
        return this.personagens.removeIf(personagem -> personagem.getId() == id);
    }

    public void adicionarParticipacao(Participacao participacao) {
        if (participacao == null) {
            System.out.println("Participação não pode ser nula.");
        } else {
            this.participacoes.add(participacao);
        }
    }

    public List<Participacao> listarParticipacoes() {
        return participacoes;
    }
}