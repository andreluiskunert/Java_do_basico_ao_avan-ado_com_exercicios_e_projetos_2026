package secao23;

public class Pato extends Animal implements Nadador, Voador {

    @Override
    public void voar() {
       System.out.println("O pato está voando pra o Norte");
    }

    @Override
    public void nadar() {
      System.out.println("O pato está nadando pra descansar as asas...");
    }
    
}
