import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private static int contadorId = 0;

    private int id;
    private String nome;
    private Mestre mestre;
    private List<Jogador> jogadores;
    private List<Participacao> participacoes;
    private List<Sessao> sessoes;

    public Mesa(String nome, Mestre mestre) {
        this.id = ++contadorId;
        setNome(nome);
        setMestre(mestre);
        this.jogadores = new ArrayList<>();
        this.participacoes = new ArrayList<>();
        this.sessoes = new ArrayList<>();
    }

    public Mesa(String nome, Mestre mestre, List<Jogador> jogadores, List<Participacao> participacoes, List<Sessao> sessoes) {
        this(nome, mestre);
        if (jogadores != null) {
            this.jogadores.addAll(jogadores);
        }
        if (participacoes != null) {
            this.participacoes.addAll(participacoes);
        }
        if (sessoes != null) {
            this.sessoes.addAll(sessoes);
        }
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
            return;
        }
        this.nome = nome;
    }

    public Mestre getMestre() {
        return mestre;
    }

    public void setMestre(Mestre mestre) {
        if (mestre == null) {
            System.out.println("Mestre não pode ser nulo.");
            return;
        }
        this.mestre = mestre;
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogador == null) {
            System.out.println("Jogador não pode ser nulo.");
            return;
        }
        this.jogadores.add(jogador);
    }

    public Jogador[] listarJogadores() {
        return this.jogadores.toArray(new Jogador[0]);
    }

    public void adicionarParticipacao(Participacao participacao) {
        if (participacao == null) {
            System.out.println("Participação não pode ser nula.");
            return;
        }
        this.participacoes.add(participacao);
    }

    public Participacao[] listarParticipacoes() {
        return this.participacoes.toArray(new Participacao[0]);
    }

    public Sessao criarSessao(LocalDate data, String descricao) {
        Sessao novaSessao = new Sessao(data, descricao);
        this.sessoes.add(novaSessao);
        return novaSessao;
    }

    public Sessao[] listarSessoes() {
        return this.sessoes.toArray(new Sessao[0]);
    }
}