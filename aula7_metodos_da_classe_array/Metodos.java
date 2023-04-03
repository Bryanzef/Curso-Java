package aula7_metodos_da_classe_array;

import java.util.Arrays;

public class Metodos {
    public static void main(String[] args){

        final int  tamanho = 10;
        int[] num = {5,15,20,3,8,2,32,40,42,90,23};
        int[] numeros = new int[tamanho];

        int pesquisa = 3;
        int posicao;

        //Ordena uma lista que estiver desorganizada
        // Arrays.sort(num);
//~ -----------------------------------------------------------------------
        //Preenche o array com 10 elementos com o valor 10
        //Arrays.fill(numeros, 10);

//~ -----------------------------------------------------------------------
        //Fez a copia do array num para numeros
        //System.arraycopy(num, 0, numeros, 0, tamanho);

//~ -----------------------------------------------------------------------
        //Faz a comparação de dois arrays num e numeros
        //Arrays.equals(num, numeros);
        //System.out.printf("%s ",Arrays.equals(num, numeros) ? "Sim" : "Não");
//~ -----------------------------------------------------------------------   

        //Para usar o binarySearch o array deve ser ordenado
        Arrays.sort(num);
        posicao = Arrays.binarySearch(num, pesquisa);
        System.out.printf("o elemento %d está no array? %s  na posição %d ",posicao,pesquisa> 0 ? "Sim" : "NÃO",posicao);

//~ -----------------------------------------------------------------------    
        //FORMA MAIS SIMPLES PARA LER OS ELEMENTOS DO ARRAY
        //for(int n:numeros){
            //System.out.printf("%d - ",n);

        }

    }
    

