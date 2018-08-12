import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        int numero;
        String resultado = "Nulo";
        
        System.out.print("Insira um número inteiro: ");
        numero = leia.nextInt();
        
        if(numero>0 && numero%2==0){
            resultado = "Positivo e Par";
        }else if(numero<0 && numero%2==0){
            resultado = "Negativo e Par";
        }else if(numero>0 && numero%2!=0){
            resultado = "Positivo e Ímpar";
        }else if(numero<0 && numero%2!=0){
            resultado = "Negativo e Ímpar";
        }
        
        System.out.println("O Número "+numero+" é: "+resultado);
    }
}