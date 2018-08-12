import java.util.Scanner;
public class Main{
    public static void main(String ars[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o Salário Fixo Mensal: R$ ");
    double salario = leia.nextDouble();
    System.out.print("Insira o Valor das Vendido no Mês: R$ ");
    double vendasMes = leia.nextDouble();
    
    double comissao = vendasMes*0.04;
    double salarioFinal = comissao+salario;
    
    System.out.println("O valor da Comissão é: R$ "+comissao);
    System.out.println("O Salário Final a ser pago é: R$ "+salarioFinal);
    }
}