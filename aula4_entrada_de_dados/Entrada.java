package aula4_entrada_de_dados;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int soma = 0;
        final int media = 60;
        String nome = "";
        String res = "";
        
        System.out.print("Digite o nome do Aluno: ");
        nome = entradaTeclado.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = entradaTeclado.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2 = entradaTeclado.nextInt();
        soma = n1 + n2;

        if (soma >= media){
           res = "Aprovado";
        }else if (soma >= 40){
            res = "Recuperação";
        }else {
            res =  "Reprovado";
        }
        
        System.out.printf("Aluno %s está %s, sua nota é %d ",nome,res,soma);

        entradaTeclado.close(); // fechando o scanner
    }   
}
