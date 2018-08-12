import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        //Entrada de Dados:
        System.out.print("Digite o valor de saque: R$ ");
        int valorsaque = leia.nextInt();
        //Processamentos:
        int saque100 = valorsaque/100;
        int saque50 = valorsaque%100/50;
        int saque20 = valorsaque%100%50/20;
        int saque10 = valorsaque%100%50%20/10;
        int saque5 = valorsaque%100%50%20%10/5;
        int saque2 = valorsaque%100%50%20%10%5/2;
        //Saida De Dados:
        System.out.println("Notas R$ 100: "+saque100);
        System.out.println("Notas R$ 50: "+saque50);
        System.out.println("Notas R$ 20: "+saque20);
        System.out.println("Notas R$ 10: "+saque10);
        System.out.println("Notas R$ 5: "+saque5);
        System.out.println("Notas R$ 2: "+saque2);
        
    }
}