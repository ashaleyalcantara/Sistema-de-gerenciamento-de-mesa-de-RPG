public class Mago extends Personagem implements Atacante {

    private int inteligencia;

    public Mago(String nome, int nivel, int vida, int inteligencia) {
        super(nome, nivel, vida);
        setInteligencia(inteligencia);
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        if (inteligencia >= 0) {
            this.inteligencia = inteligencia;
        } else {
            System.out.println("O valor da inteligência é inválido.");
        }
    }

    @Override
    public String atacar() {
        return "O mago " + getNome() + " atacou com inteligência " + inteligencia + ".";
    }
}