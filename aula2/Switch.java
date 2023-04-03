package aula2;

public class Switch {
    public static void main(String[] args){
        //Caso a Instrução Seja verdadeira ele executa o if

        // == IGUAL | > MAIOR | < MENOR | >= MAIOR OU IGUAL | <= MENOR OU IGUAL | != DIFERENTE | ! NOT

      int posicao=5
      ;

      switch(posicao){
        case 1:
            System.out.println("Primeiro");
            break;
        case 2:
            System.out.println("Segundo");
            break;
        case 3:
            System.out.println("Terceiro");
            break;
        case 4: case 5: case 6:
            System.out.println("Premio de Participaçao");
        default:
            System.out.println("Não Subiu");
            break;
  
      }

    }
}
