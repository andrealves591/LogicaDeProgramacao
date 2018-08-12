import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o Salário-Base: R$ ");
    double salBase = leia.nextDouble();
    
    double gratificacao = salBase*0.05;
    double imposto = salBase*0.07;
    double receber = salBase+gratificacao-imposto;
    
    System.out.println("O total a receber é: R$ "+receber);

    }
}