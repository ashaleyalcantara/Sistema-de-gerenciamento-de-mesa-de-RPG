public class Arqueiro extends Personagem implements Atacante {

    private int precisao;

    public Arqueiro(String nome, int nivel, int vida, int precisao) {
        super(nome, nivel, vida);
        setPrecisao(precisao);
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        if (precisao >= 0) {
            this.precisao = precisao;
        } else {
            System.out.println("O valor da precisão é inválido.");
        }
    }

    @Override
    public String atacar() {
        return "O arqueiro " + getNome() + " atacou com precisão " + precisao + ".";
    }
}