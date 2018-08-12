import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println(":::Informe dos Dados do Aluno:::");
        System.out.print("Nome: ");
        objAluno.setNome(leia.nextLine());
        System.out.print("Média: ");
        objAluno.setMedia(leia.nextDouble());
        
        System.out.println("\n:::Dados do Aluno:::");
        System.out.println("Nome: "+objAluno.getNome());
        System.out.println("Média: "+objAluno.getMedia());
        System.out.println("Conceito Final: "+objAluno.verificarConceito());
    }
}