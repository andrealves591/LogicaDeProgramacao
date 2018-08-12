import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o Preço por Litro: R$ ");
    double preco = leia.nextDouble();
    System.out.print("Insira a Quantidade de KM por Litro de seu carro: ");
    double kmlitro = leia.nextDouble();
    System.out.print("Insira a Distância a percorrer: ");
    double distancia = leia.nextDouble();
    
    double litrosDistancia = distancia/kmlitro;
    double valorTotal = litrosDistancia*preco;
    
    System.out.println("São necessários: "+litrosDistancia+" L");
    System.out.println("O Total de Gastos será: R$ "+valorTotal);
    }
}