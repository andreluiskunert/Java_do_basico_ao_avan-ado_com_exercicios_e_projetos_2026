package secao20;

public class Quadrado extends Forma {
    //Quinta-feira,11/06/2026_D'noite
     private double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        return Math.PI  * Math.pow(lado, 2);
    }
}
