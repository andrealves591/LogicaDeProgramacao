import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        Saque objSaque = new Saque();
        
        System.out.println(":::Digite os Dados de Saque:::");
        System.out.print("Valor: R$ ");
        objSaque.setValor(leia.nextInt());
        
        System.out.println("\n:::Dados de Saque:::");
        System.out.println("\nValor: R$ "+objSaque.getValor()+"\n");
        System.out.println("Notas R$ 100: "+objSaque.calcularNotas100());
        System.out.println("Notas R$ 50: "+objSaque.calcularNotas50());
        System.out.println("Notas R$ 5: "+objSaque.calcularNotas5());
        System.out.println("Notas R$ 1: "+objSaque.calcularNotas1());
    }
}