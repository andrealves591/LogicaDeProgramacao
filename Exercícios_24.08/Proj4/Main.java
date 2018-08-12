import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o valor: ");
    int valor = leia.nextInt();
    
    int quadrado = valor*valor;
    
    System.out.println("O quadrado desse valor é: "+quadrado);
    }
}