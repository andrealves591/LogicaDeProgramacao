import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        //Declaração das Variáveis:
        String nome;
        double n1;
        double n2;
        double frequencia;
        double media;
        String resultado = "Aprovado";
        //Entrada de Dados:
        System.out.println(":::Boletim Escolar:::");
        System.out.print("Insira o Nome do Aluno: ");
        nome = leia.nextLine();
        System.out.print("Insira a Nota 1: ");
        n1 = leia.nextDouble();
        System.out.print("Insira a Nota 2: ");
        n2 = leia.nextDouble();
        System.out.print("Insira a Frequência do Aluno: ");
        frequencia = leia.nextDouble();
        //Processamento:
        media = (n1+n2)/2;
        if(media<6&&frequencia<75){
            resultado = "Aluno Reprovado";
        }else if (media>=6&&frequencia<75){
            resultado = "Aluno aprovado por média e reprovado por frequência!";
        }else if (media<6&&frequencia>=75){
            resultado = "Aluno aprovado por frequência e reprovado por média!";
        }
        //Saída de Dados:
        System.out.println(":::BOLETIM ESCOLAR:::");
        System.out.println("Nome do Aluno: "+nome);
        System.out.println("Nota 1: "+n1+" pts");
        System.out.println("Nota 2: "+n2+" pts");
        System.out.println("Frequência: "+frequencia);
        System.out.println("Média Final: "+media);
        System.out.println("Situação: "+resultado);
    }
}
    
