package secao05;

public class CondicionaisDois {
    public static void main(String[] args) {
    //    Sexta-feira, 01/05/2026_De manhã "aproveitando o feiradão..."
        System.out.println("01ª Condicional Ternária: ");
        int numero = 11;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);
        // CONDICAO x > 5 ? EXPRESSAO SE É TRUE "Ok" : EXPRESSAO SE É FALSE "Não Ok"
              //
              System.out.println(" 2 - If encadeado");
        int idade = 16;
        boolean temCarteira = false;

        if(idade >= 18) {

            if(temCarteira) {
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa ter a habilitação para dirigir!");
            }

        } else {
            System.out.println("Você não pode dirigir ainda!");
        }

        //
        System.out.println(" 3 - Precedencia");
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        // TRUE OU FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        boolean resultado4 = !(a || b) && c;

        // NOT (TRUE OU FALSE) => NOT(TRUE) => FALSE AND TRUE => FALSE
        System.out.println(resultado4);

        boolean resultado5 = (!a || b) && c;
 System.out.println(" Isso é: (NOT TRUE OR FALSE) AND TRUE\n" + //
          "         (FALSE OR FALSE) AND TRUE\n" + //
          "         FALSE AND TRUE\n" + //
          "        FALSE");
        
        System.out.println(resultado5); 



    }
    }

