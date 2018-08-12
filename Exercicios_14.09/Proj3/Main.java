import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        Cliente objCliente1 = new Cliente();
        Cliente objCliente2 = new Cliente();
        
        System.out.println("Digite os dados do Cliente 1:");
        System.out.print("Nome: ");
        objCliente1.nome = leia.next();
        System.out.print("CPF: ");
        objCliente1.cpf = leia.next();
        System.out.print("Rg: ");
        objCliente1.rg = leia.next();
        System.out.print("Endereço: ");
        objCliente1.endereco = leia.next();
        System.out.print("Renda Bruta: R$ ");
        objCliente1.rendaBruta = leia.nextDouble();
        System.out.print("Limite: R$ ");
        objCliente1.limite = leia.nextDouble();
        
        System.out.println("Digite os dados do Cliente 2:");
        System.out.print("Nome: ");
        objCliente2.nome = leia.next();
        System.out.print("CPF: ");
        objCliente2.cpf = leia.next();
        System.out.print("Rg: ");
        objCliente2.rg = leia.next();
        System.out.print("Endereço: ");
        objCliente2.endereco = leia.next();
        System.out.print("Renda Bruta: R$ ");
        objCliente2.rendaBruta = leia.nextDouble();
        System.out.print("Limite: R$ ");
        objCliente2.limite = leia.nextDouble();
        
        System.out.println("\n\nDados do Cliente 1\n");
        System.out.println("Nome: "+objCliente1.nome);
        System.out.println("CPF: "+objCliente1.cpf);
        System.out.println("Rg: "+objCliente1.rg);
        System.out.println("Endereço: "+objCliente1.endereco);
        System.out.println("Renda Bruta: R$ "+objCliente1.rendaBruta);
        System.out.println("Limite: R$ "+objCliente1.limite);
        
        System.out.println("\nDados do Cliente 2\n");
        System.out.println("Nome: "+objCliente2.nome);
        System.out.println("CPF: "+objCliente2.cpf);
        System.out.println("Rg: "+objCliente2.rg);
        System.out.println("Endereço: "+objCliente2.endereco);
        System.out.println("Renda Bruta: R$ "+objCliente2.rendaBruta);
        System.out.println("Limite: R$ "+objCliente2.limite);
    }
}