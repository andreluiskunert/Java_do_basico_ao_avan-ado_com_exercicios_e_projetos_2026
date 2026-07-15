package secao23;
// Terça-feira_D'noite, 14/07/2026
public class Caixa<T> {
    private T conteudo;
    public void adicionar(T conteudo){
        this.conteudo = conteudo;
    }
    public T obter(){
        return conteudo;
    }
}
