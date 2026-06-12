package secao20;

public class Circulo extends Forma{
    //Quinta-feira,11/06/2026_D'noite
    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return Math.PI  * Math.pow(raio, 2);
    }

}
