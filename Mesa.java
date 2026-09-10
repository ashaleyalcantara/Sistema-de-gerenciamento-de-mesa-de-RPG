import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private static int contadorId = 0;

    private int id;
    private String nome;
    private Mestre mestre; //Adicionamos um atributo mestre para a mesa juntamente com seus métodos para representar a relação unilateral existente no diagrama 
    private List<Jogador> jogadores;
    private List<Participacao> participacoes;
    private List<Sessao> sessoes;

    public Mesa(String nome) {
        this.id = ++contadorId;
        setNome(nome);
        this.jogadores = new ArrayList<>();
        this.participacoes = new ArrayList<>();
        this.sessoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome da mesa não pode ser nulo ou vazio.");
        } else {
            this.nome = nome;
        }
    }

    public Mestre getMestre() {
        return mestre;
    }

    public void adicionarMestre(Mestre mestre) {
        if (mestre == null) {
            System.out.println("Mestre não pode ser nulo.");
        } else {
            this.mestre = mestre;
        }
    }
    
    public void adicionarJogador(Jogador jogador) {
        if (jogador == null) {
            System.out.println("Jogador não pode ser nulo.");
        } else {
            this.jogadores.add(jogador);
        }
    }

    public List<Jogador> listarJogadores() {
        return jogadores;
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

    public Sessao criarSessao(LocalDate data, String descricao) {
        Sessao novaSessao = new Sessao(data, descricao);
        this.sessoes.add(novaSessao);
        return novaSessao;
    }

    public List<Sessao> listarSessoes() {
        return sessoes;
    }
}