package secao23;

public class ArmazenamentoTexto {
    public String texto;

    // @Override
    public void salvar(String item) {
        this.texto = item;
    }

    // @Override
    public String recuperar() {
        return texto;
    }
}
