package aula6_criar_array;
import java.util.Scanner;


public class Cria_Arrays {

    public static void main(String[] args) {

        final int tamanho = 5;
        char[] gabarito = {'a','a','d','b','c'};
        char[] respostas = new char[tamanho];

        //Variaveis das notas
        int nota = 0;
        Scanner scan = new Scanner(System.in);
        
    
        for ( int i=0; i<tamanho;i++){
            System.out.printf("Informe a nota do aluno %d: ", i);
            respostas[i] = scan.nextLine().charAt(0);

        }
  

        for(int i = 0; i< tamanho;i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.printf("%nnota do aluno: %d ", nota);
       



       /*  
         final int tamanho = 5;
        int[] num = new int[tamanho];
        int[] numeros = {10,20,30,40,50}   ;

        ADC ELEMENTOS NO ARRAY
        num[0] = 10;
        num[1] = 5;
        num[2] = 20;
        num[3] = 2;
        num[4]  = 2232;

        PARA PERCORRER UM ARRAY DEVE SER USADO
        for(int i=0; i<5;i++){
            
        System.out.printf("%d - ", numeros[i]); */

        }

         
    }

