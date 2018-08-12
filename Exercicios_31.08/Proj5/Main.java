import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        String nome;
        double meta;
        double totalVendas;
        double comissao;
        
        System.out.println("::Dados do Vendedor::");
        System.out.print("Nome: ");
        nome = leia.nextLine();
        System.out.print("Meta do Mês: R$ ");
        meta = leia.nextDouble();
        System.out.print("Total Vendido: R$ ");
        totalVendas = leia.nextDouble();
        
        if(totalVendas<meta/2){
            comissao = totalVendas*0.01;
        }else if(totalVendas<=meta*0.75){
            comissao = totalVendas*0.025;
        }else if(totalVendas<=meta){
            comissao = totalVendas*0.035;
        }else{
            comissao = totalVendas*0.05;
        }
        
        System.out.println(":::Dados do Vendedor:::");
        System.out.println("Nome: "+nome);
        System.out.println("Meta de Vendas: R$ "+meta);
        System.out.println("Total de Vendas: R$ "+totalVendas);
        System.out.println("Valor da Comissão: R$ "+comissao);
    }
}