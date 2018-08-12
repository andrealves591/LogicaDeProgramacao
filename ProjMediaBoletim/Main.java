import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        String nomeAluno;
        String ra;
        double n1;
        double n2;
        double media;
        String situacao;
        
        System.out.print("Digite o Nome do Aluno: ");
        nomeAluno = leia.nextLine();
        System.out.print("Digite o RA do Aluno: ");
        ra = leia.next();
        System.out.print("Insira a Nota 1: ");
        n1 = leia.nextDouble();
        System.out.print("Insira a Nota 2: ");
        n2 = leia.nextDouble();
        
        media = (n1+n2)/2;
        if(media>=6){
            situacao = "Aprovado";
        }else{
            situacao = "Reprovado";
        }
        
        System.out.println(":::::::::::::::::::::::::::::::");
        System.out.println("Nome do Aluno: "+nomeAluno);
        System.out.println("RA do Aluno: "+ra);
        System.out.println("Nota 1: "+n1);
        System.out.println("Nota 2: "+n2);
        System.out.println("Média Final: "+media);
        System.out.println("Situação Final: "+situacao);
        
        
    }
}