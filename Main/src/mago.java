public class Mago extends Personagem {
    private int pontosMagia;

    // Construtor
    public Mago(String nome, int hp, int ataque, int pontosMagia) {
        super(nome, hp, ataque);
        this.pontosMagia = pontosMagia;
    }

    
    @Override
    public void atacar(Personagem alvo) {
        if (this.pontosMagia > 0) {
            System.out.println(this.nome + " lança um feitiço em " + alvo.nome + " causando " + this.ataque + " de dano.");
            alvo.receberDano(this.ataque);
            this.pontosMagia--;
        } else {
            System.out.println(this.nome + " não tem pontos de magia suficientes para atacar.");
        }
    }

    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Pontos de Magia: " + this.pontosMagia);
    }
}