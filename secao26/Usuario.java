package secao26;

public class Usuario {
    @NotEmpty(message = "O campo nome não pode ser vazio")
    private String nome;
    @NotEmpty(message = "O campo Email não pode ser vazio")
    private String email;
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;

    }
}
