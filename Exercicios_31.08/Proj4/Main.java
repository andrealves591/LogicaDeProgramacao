import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        String nome;
        byte idade;
        String classificacao;
        
        System.out.println("::Insira os Dados a Seguir::");
        System.out.print("Nome do Nadador: ");
        nome = leia.nextLine();
        System.out.print("Idade: ");
        idade = leia.nextByte();
        
        if(idade<8 || idade>60){
            classificacao = "Não pode ser nadador!";
        }else if (idade<= 10){
            classificacao = "Infantil";
        }else if(idade<= 17){
            classificacao = "Juvenil";
        }else if(idade<= 49){
            classificacao = "Adulto";
        }else{
            classificacao = "Terceira Idade";
        }
        
        System.out.println(":::Dados do Nadador:::");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Classificação: "+classificacao);
    }
}