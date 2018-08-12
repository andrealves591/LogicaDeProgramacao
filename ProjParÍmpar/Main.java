import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        int numero;
        String resultado = "Par";
        
        System.out.print("Informe um Número Inteiro: ");
        numero = leia.nextInt();
        
        if(numero==0){
            resultado = "Neutro";
        }else if(numero%2!=0){
            resultado = "Ímpar";
        }
        
        System.out.println("O Número "+numero+" é: "+resultado);
    }
}