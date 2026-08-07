package secao26;

public class Cachorro extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("O toto está Latindo...");
    }
    @SuppressWarnings("deprecation")
    public void testeMover(){
        mover();
        System.out.println("Se movendo...");
    }
}
