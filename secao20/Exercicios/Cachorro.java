package secao20.Exercicios;
// Sexta-feira,19/06/2026_D'Noite
public class Cachorro extends Animal {
    private String raca;
    public Cachorro(String nome, String som, String raca){
        super(nome, som);
        this.raca = raca;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + ", Raça: " + raca);

        this.emitirSom();

    }
}
