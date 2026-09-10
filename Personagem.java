import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {

    private static int contadorId = 0;

    private int id;
    private String nome;
    private int nivel;
    private int vida;
    private List<Item> itens;
    private Personagem mentor;

    public Personagem(String nome, int nivel, int vida) {
        this.id = ++contadorId;
        this.itens = new ArrayList<>();

        setNome(nome);
        setNivel(nivel);
        setVida(vida);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome do personagem não pode ser nulo ou vazio.");
        } else {
            this.nome = nome;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        } else {
            System.out.println("O valor do nível é inválido.");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida > 0) {
            this.vida = vida;
        } else {
            System.out.println("O valor da vida é inválido.");
        }
    }

    public void adicionarItem(Item item) {
        if (item != null) {
            this.itens.add(item);
        } else {
            System.out.println("Item não pode ser nulo.");
        }
    }

    public boolean removerItem(int id) {
        return itens.removeIf(item -> item.getId() == id);
    }

    public List<Item> listarItens() {
        return itens;
    }

    public void definirMentor(Personagem mentor) {
        if (mentor == null) {
            System.out.println("Mentor não pode ser nulo.");
        } else if (mentor == this) {
            System.out.println("Um personagem não pode ser seu próprio mentor.");
        } else {
            this.mentor = mentor;
        }
    }

    public Personagem getMentor() {
        return mentor;
    }

    public void receberDano(int dano) {
        if (dano > 0) {
            vida -= dano;
 
            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public void curar(int valor) {
        if (valor > 0) {
            vida += valor;
        }
    }

    public abstract String atacar();
}