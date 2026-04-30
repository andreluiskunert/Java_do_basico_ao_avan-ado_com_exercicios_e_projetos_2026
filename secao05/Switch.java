package secao05;

public class Switch {
    public static void main(String[] args) {
        // dia da semana
        int diaDaSemana = 1;
        switch(diaDaSemana){
             case 1:
                System.out.println("Domingo");
                break;
            case 2: 
                System.out.println("Segunda-feira");
                break;
            case 3: 
                System.out.println("Terça-feira");
                break;
            case 4: 
                System.out.println("Quarta-feira");
                break;
           }
              // if(diaDaSemana  == 1) {} else if (diaDaSemana == 2) {} ...

        System.out.println("default é o else do switch");
        int n = 10;

        switch (n) {
            case 1:
                System.out.println("É 1");
                break;
            case 2:
                System.out.println("É 2");
                break;
            default:
                System.out.println("Número não encontrado");
                break;
        }

        // 13 - switch sem break
          System.out.println("switch sem break");
        switch (1) {
            case 1:
            System.out.println("Executou 1ª");


            case 2:
            System.out.println("Executou 2ª");


            case 3:
            System.out.println("Executou 3ª");

        
            default:
            System.out.println("Executou 4ª");

        }
        System.out.println("NOW");
        System.out.println("The End ");

        }
    
}
