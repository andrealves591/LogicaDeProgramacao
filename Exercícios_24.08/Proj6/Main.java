import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner leia = new Scanner(System.in);
    
    double a = 0, b = 0, c = 0, d, x1, x2;
            
    System.out.print("Entre com o valor de A= ");
    a = leia.nextDouble();      
    System.out.print("Entre com o valor de B= ");
    b = leia.nextDouble();
    System.out.print("Entre com o valor de C= ");
    c = leia.nextDouble();
                    
    d = (b * b - 4) * a * c;
        
    if (d < 0)
        {
            System.out.println("O valor de delta é menor que zero");
        }       

        else       
        {           
           x1 = (-b + Math.sqrt(d))/(2 * a);
  
           x2 = (-b - Math.sqrt(d))/(2 * a);
                        
           System.out.println("O Valor de delta é: " + d);
            
           System.out.println("O Valor de x1 é: " + x1 + ", o valor de x2 é: " + x2);
        }
    }
}