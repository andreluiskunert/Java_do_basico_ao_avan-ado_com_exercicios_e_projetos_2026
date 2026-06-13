/*  // package secao_17;

public class Carro {
    // atributos ou propriedades 
    String marca;
    String modelo;
    int ano; // 2012
    // Métodos
     void acelerar(){
        System.out.println("Pisando fundo lá no fim da lata...");
     }
     public void exibirInfo(){
      System.out.println("Marca:"  + marca +  " Modelo:"  + modelo +  "ano:"   + ano +";" );

      
   }
  // 3 - métodos
    void ligarMotor() {

        if(!motorLigado) {

            motorLigado = true;
            System.out.println("Ligando motor...");

        } else {
            System.out.println("O motor já está ligado!");
        }
   void aumentarVelocidade(double incremento) {
        if(motorLigado) {

            velocidadeAtual += incremento;

            System.out.println("A velocidade atual é: " + velocidadeAtual);

        } else {
            System.out.println("Primeiro precisa ligar o motor.");
        }
    }
    

} */
package secao17;

public class Carro {

    String marca;
    String modelo;
    int ano;
    boolean motorLigado;

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void aumentarVelocidade(double velocidade) {
        System.out.println("Velocidade aumentada em " + velocidade + " km/h");
    }

    public void ligarMotor() {
        motorLigado = true;
        System.out.println("Motor ligado!");
    }
}