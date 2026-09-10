import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Mestre mestre = new Mestre("Renato");

        Mesa mesa = new Mesa("Campanha das Sombras");
        mesa.adicionarMestre(mestre);

        Jogador jogador1 = new Jogador("Pedro");
        Jogador jogador2 = new Jogador("Carlos");

        mesa.adicionarJogador(jogador1);
        mesa.adicionarJogador(jogador2);

        Guerreiro guerreiro = new Guerreiro("Luisa", 5, 100, 18);
        Mago mago = new Mago("Carol", 7, 60, 20);
        Arqueiro arqueiro = new Arqueiro("Vicente", 4, 75, 15);

        Item espada = new Item("Espada Longa", "Arma");
        Item escudo = new Item("Escudo de Ferro", "Armadura");
        Item pocao = new Item("Poção de Vida", "Consumível");

        guerreiro.adicionarItem(espada);
        guerreiro.adicionarItem(escudo);
        mago.adicionarItem(pocao);

        guerreiro.definirMentor(mago);

        jogador1.adicionarPersonagem(guerreiro);
        jogador1.adicionarPersonagem(mago);
        jogador2.adicionarPersonagem(arqueiro);

        Participacao part1 = new Participacao("Combatente", LocalDate.now());
        Participacao part2 = new Participacao("Suporte", LocalDate.now());

        mesa.adicionarParticipacao(part1);
        mesa.adicionarParticipacao(part2);

        mesa.criarSessao(LocalDate.now(), "A invasão da masmorra antiga");
        mesa.criarSessao(LocalDate.now().plusDays(7), "O confronto na torre");

        System.out.println(mestre.narrar("Bem-vindos à campanha!"));
        System.out.println(guerreiro.atacar());
        System.out.println(mago.atacar());
        System.out.println(arqueiro.atacar());

        if (guerreiro.getMentor() != null) {
            System.out.println("Mentor de " + guerreiro.getNome() + ": " + guerreiro.getMentor().getNome());
        }

        guerreiro.receberDano(30);
        System.out.println("Vida de " + guerreiro.getNome() + " após dano: " + guerreiro.getVida());
        guerreiro.curar(10);
        System.out.println("Vida de " + guerreiro.getNome() + " após cura: " + guerreiro.getVida());

        System.out.println("Itens de " + guerreiro.getNome() + " antes: " + guerreiro.listarItens().size());
        guerreiro.removerItem(escudo.getId());
        System.out.println("Itens de " + guerreiro.getNome() + " após remoção: " + guerreiro.listarItens().size());

        System.out.println("Busca por ID 2: " + (jogador1.buscarPersonagem(2) != null ? jogador1.buscarPersonagem(2).getNome() : "Não encontrado"));

        System.out.println("Total de personagens de " + jogador1.getNome() + " antes: " + jogador1.listarPersonagens().size());
        jogador1.removerPersonagem(mago.getId());
        System.out.println("Total de personagens de " + jogador1.getNome() + " após remoção: " + jogador1.listarPersonagens().size());

        System.out.println("Jogadores na mesa: " + mesa.listarJogadores().size());
        System.out.println("Participações registradas: " + mesa.listarParticipacoes().size());
        System.out.println("Total de sessões na mesa: " + mesa.listarSessoes().size());
    }
}