import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;
        double angulo1;
        double angulo2;
        double angulo3;
        String triangulo;
        String angTriangulo;
        
        System.out.println(":::Entre com as Medidas do Triângulo:::");
        System.out.print("Lado 1: ");
        lado1 = leia.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = leia.nextDouble();
        System.out.print("Lado 3: ");
        lado3 = leia.nextDouble();
        System.out.print("Ângulo 1: ");
        angulo1 = leia.nextDouble();
        System.out.print("Ângulo 2: ");
        angulo2 = leia.nextDouble();
        System.out.print("Ângulo 3: ");
        angulo3 = leia.nextDouble();
        
        if(lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado1+lado2)&& angulo1>0 && angulo2>0 && angulo3>0 && (angulo1+angulo2+angulo3)==180){
           if(lado1==lado2 && lado2==lado3){
               triangulo = "Equilátero";
           }else if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1){
               triangulo = "Escaleno";
           }else{
               triangulo = "Isóseles";
           }
           if(angulo1>90 || angulo2>90 || angulo3>90){
               angTriangulo = "Obtusângulo";
           }else if(angulo1<90 && angulo2<90 && angulo3<90){
               angTriangulo = "Acutângulo";
           }else{
               angTriangulo = "Retângulo";
           }
           System.out.println("Classificações do Triângulo");
           System.out.println("Lado: "+triangulo);
           System.out.println("Ângulos: "+angTriangulo);
        }else{
            System.out.print("Triângulo Inválido!");
        }
    }
}