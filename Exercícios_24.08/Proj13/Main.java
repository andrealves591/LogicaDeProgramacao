import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Informe a quantidade de Refrigerantes 350ml vedidos: ");
    int lata = leia.nextInt();
    System.out.print("Informe a quantidade de Refrigerantes 600ml vedidos: ");
    int ref600 = leia.nextInt();
    System.out.print("Informe a quantidade de Refrigerantes 2L vedidos: ");
    int ref2L = leia.nextInt();
    double mlLata = 0.35;
    double mlRef600 = 0.6;
    double mlRef2L = 2.0;
    double precoLata = 1.20;
    double precoRef600 = 1.80;
    double precoRef2L = 2.80;
    
    double litrosVendidos = (lata*mlLata)+(mlRef600*ref600)+(mlRef2L*ref2L);
    double valorTotal = (lata*precoLata)+(precoRef600*ref600)+(precoRef2L*ref2L);
    
    System.out.println("O Total de Litros vendidos é: "+litrosVendidos+" L");
    System.out.println("O Valor Total de Vendas é: R$ "+valorTotal);
    }
}