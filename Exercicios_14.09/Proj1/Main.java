import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        Produto objProduto = new Produto();
        
        System.out.println("CADASTRO DE PRODUTOS");
        System.out.print("Nome: ");
        objProduto.nome = leia.next();
        System.out.print("Descrição: ");
        objProduto.descricao = leia.next();
        System.out.print("Valor: R$ ");
        objProduto.valor = leia.nextDouble();
        
        System.out.println("\nProduto Cadastrado com Sucesso!\n");
        System.out.println("\nDADOS DO PRODUTO\n");
        System.out.println("Nome: "+objProduto.nome);
        System.out.println("Descrição: "+objProduto.descricao);
        System.out.println("Valor: R$ "+objProduto.valor);
    }
}