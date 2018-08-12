import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite seu ano de nascimento: ");
    int anoNasc = leia.nextInt();
    System.out.print("Digite seu ano atual: ");
    int anoAtual = leia.nextInt();
    
    int idade = anoAtual-anoNasc;
    int futuro = 2020-anoNasc;
    
    System.out.println("Sua idade é: "+idade+" anos");
    System.out.println("Sua idade em 2020 será: "+futuro+" anos");
    }
}