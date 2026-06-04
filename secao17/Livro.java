public class Livro {
    // Quinta-feira, 04/06/2026_D'manhã_Feiradão...
     private String titulo;
    private String autor;
    private double preco;

    // fallback
    public Livro() {
        this.titulo = "Título teste";
        this.autor = "Autor";
        this.preco = 16.99;
    }

    // override
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", preço: " + preco);
    }

}
