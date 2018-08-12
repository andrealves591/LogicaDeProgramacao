import java.util.Scanner;
public class Main{
    public static void main(String ars[]){
    Scanner leia = new Scanner(System.in);
    System.out.print("Insira o seu peso: ");
    double pesokg = leia.nextDouble();
    
    double engordar = pesokg+pesokg*0.15;
    double emagrecer = pesokg-pesokg*0.2;
    
    System.out.println("Seu peso engordando 15% é: "+engordar+" Kg");
    System.out.println("Seu peso emagrecendo 20% é: "+emagrecer+" Kg");
    }
}