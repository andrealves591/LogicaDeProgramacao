import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
       
        double numero;
        String resultado = "Neutro";
        
        System.out.print("Entre com um Número qualquer: ");
        numero = leia.nextDouble();
        
        if(numero>0){
            resultado = "Positivo";
        }else if(numero<0){
            resultado = "Negativo";
        }
        
        System.out.println("Número: "+numero);
        System.out.println("O Valor é: "+resultado);
    }
}