public class Guerreiro extends Personagem implements Atacante {

    private int forca;

    public Guerreiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida);
        setForca(forca);
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca >= 0) {
            this.forca = forca;
        } else {
            System.out.println("O valor da força é inválido.");
        }
    }

    @Override
    public String atacar() {
        return "O guerreiro " + getNome() + " atacou com força " + forca + ".";
    }
}