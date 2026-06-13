package secao20;

abstract class InstrumentoMusical {
    protected String nome;
    public InstrumentoMusical(String nome){
        this.nome = nome;
    }
    public abstract void tocar();
    public void exibirDetalhes(){
        System.out.println("Instrumento: "+ nome);
    }
}
