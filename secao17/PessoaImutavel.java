public class PessoaImutavel {
         // Sabádo, 06/06/2026_D'Noite
        private final String nome;
        private final int idade;
    public PessoaImutavel(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    } 
      public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    } 
}
