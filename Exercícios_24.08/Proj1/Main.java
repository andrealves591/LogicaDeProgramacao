import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o 1º Valor: ");
        double valor1 = leia.nextDouble();
        System.out.print("Digite o 2º Valor: ");
        double valor2 = leia.nextDouble();
        System.out.print("Digite o 3º Valor: ");
        double valor3 = leia.nextDouble();
        
        double soma = (valor1+valor2)*(valor2+valor3);
   
        System.out.println("O resultado é: "+soma);
        
    }
}    