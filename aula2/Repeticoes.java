package aula2;

public class Repeticoes{
    
    public static void main(String[] args){
        //Caso a Instrução Seja verdadeira ele executa o if

        // == IGUAL | > MAIOR | < MENOR | >= MAIOR OU IGUAL | <= MENOR OU IGUAL | != DIFERENTE | ! NOT

        int nota = 40;
        int faltas = 5;
        int maxFaltas = 12;
        int media = 60;
        String res;

        //operação Ternaria
        res = (nota >= media ? "APROVADO" : "REPROVADO");
        System.out.println("Resultado = " + res);

        /* 
        if ((nota >= media) && (faltas <= maxFaltas)){
        System.out.println("Aluno Aprovado");
}       else if (nota >= 40){
        System.out.println("Aluno em Recuperação");
}       else {
        System.out.println("Aluno Reprovado");
}
        System.out.println("Fim do Programa"); */

    }

}