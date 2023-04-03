package aula8_matrizes;


import java.security.SecureRandom;
public class Matrizes {
    public static  void main(String[] args) {

        //Criando uma matriz com 3 linhas e 5 colunas
        final int linhas = 3;
        final int colunas = 5;

        int[][] numeros = new int[linhas][colunas];
        int[][] num = {{1,2,3,4,5},{1,2,3,4,5,},{100,200,300,400,500}};

        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }
        /* 
        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                System.out.printf("%2d - ", numeros[l][c]);
            }
            System.out.printf("%n");
        }
        */
        for(int[] n:num){
            for(int v:n){
                System.out.printf("%4d - ",v);

            }
            System.out.printf("%n");

            

        }

    }
}

