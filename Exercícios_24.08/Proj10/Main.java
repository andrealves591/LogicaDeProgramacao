import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o Valor de Fábrica: R$ ");
    double valorFabrica = leia.nextDouble();
    double percentualImpostos = 45.0;
    double porcentagemDist = 28.0;
   
    double impostos = (valorFabrica*percentualImpostos)/100;
    double distribuidor = ((valorFabrica+percentualImpostos)*porcentagemDist)/100.000;
    double custoConsumidor = (valorFabrica+distribuidor+impostos);
    
    System.out.println("O Custo ao Consumidor é de: R$ "+custoConsumidor);
    
    }
}