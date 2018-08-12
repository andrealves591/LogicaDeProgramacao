import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o Valor do Salário Mínimo: R$ ");
    int salarioMinimo = leia.nextInt();
    System.out.print("Insira o Valor do seu Salário: R$ ");
    int salarioFunc = leia.nextInt();
    
    int calculo = salarioFunc/salarioMinimo;
    
    System.out.println("Este fucionário recebe "+calculo+"x o Salário Mínimo!!!");
    }
}