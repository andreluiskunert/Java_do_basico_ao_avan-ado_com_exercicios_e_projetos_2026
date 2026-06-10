package secao20;
// Terça-feira, 09/06/2026_D'Noite
public class Motor {
    //Obs.: pode ser em vários lúgares;
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia){
           this.tipo = tipo;
        this.potencia = potencia;
    }
     public void exibirInfo() {
        System.out.println("Motor tipo: " + tipo + ", potencia: " + potencia + " cavalos.");
    }
}
