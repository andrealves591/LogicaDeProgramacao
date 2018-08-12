import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        int numero;
        String dia;
        
        System.out.print("Insira um Número Inteiro: ");
        numero = leia.nextInt();
        
        dia = "Inválido";
        
        if(numero==1){
            dia = "Domingo";
        }else if(numero==2){
            dia = "Segunda-Feira";
        }else if(numero==3){
            dia = "Terça-Feira";
        }else if(numero==4){
            dia = "Quarta-Feira";
        }else if(numero==5){
            dia = "Quinta-Feira";
        }else if(numero==6){
            dia = "Sexta-Feira";
        }else if(numero==7){
            dia = "Sábado";
        }
        
        System.out.println("O Dia é "+numero+" e o Dia da Semana é "+dia+"!");
    }
}