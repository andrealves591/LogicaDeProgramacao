import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        String nome;
        byte idade;
        String sexo;
        float altura;
        double pesoIdeal;
        
        System.out.println(":::Insira seus dados pessoais:::");
        System.out.print("Nome: ");
        nome = leia.nextLine();
        System.out.print("Idade: ");
        idade = leia.nextByte();
        System.out.print("Sexo [M] ou [F]: ");
        sexo = leia.next();
        System.out.print("Altura: ");
        altura = leia.nextFloat();

        
        if(sexo=="M"){
            pesoIdeal = (72.7*altura)-57;
        }else{
            pesoIdeal = (62.1*altura)-44.7;
        }
        
        System.out.println(":::Dados Pessoais:::");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Sexo: "+sexo);
        System.out.println("Altura: "+altura);
        System.out.println("Peso Ideal: "+pesoIdeal);
    }
}