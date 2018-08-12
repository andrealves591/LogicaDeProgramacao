import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o 1º Valor: ");
    double valor1 = leia.nextDouble();
    System.out.print("Insira o 2º Valor: ");
    double valor2 = leia.nextDouble();
    System.out.print("Insira o 3º Valor: ");
    double valor3 = leia.nextDouble();
    System.out.print("Insira o 4º Valor: ");
    double valor4 = leia.nextDouble();
    System.out.print("Insira o 5º Valor: ");
    double valor5 = leia.nextDouble();
    
    double soma = valor1+valor2+valor3+valor4+valor5;
    double produto = valor1*valor2*valor3*valor4*valor5;
    double media = (soma/5);
    
    System.out.println("A Soma dos valores é: "+soma);
    System.out.println("O Produto dos valores é: "+produto);
    System.out.println("A Média dos valores é: "+media);
    
    }
}