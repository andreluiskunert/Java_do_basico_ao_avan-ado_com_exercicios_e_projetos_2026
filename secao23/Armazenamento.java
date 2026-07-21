package secao23;

public interface Armazenamento<T> {
// Segunda-feira_D'noite,20/07/2026
    void salvar(T item);
    T recuperar();
    
}
