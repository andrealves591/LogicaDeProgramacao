import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        Cao objCao1 = new Cao();
        Cao objCao2 = new Cao();
        
        System.out.println("Digite os dados do Cão 1:");
        System.out.print("Nome: ");
        objCao1.nome = leia.next();
        System.out.print("Raça: ");
        objCao1.raca = leia.next();
        System.out.print("Cor: ");
        objCao1.cor = leia.next();
        System.out.print("Sexo: ");
        objCao1.sexo = leia.next();
        System.out.print("Porte: ");
        objCao1.porte = leia.next();
        System.out.print("Idade: ");
        objCao1.idade = leia.nextByte();
        System.out.print("Dono: ");
        objCao1.dono = leia.next();
        
        System.out.println("Digite os dados do Cão 2:");
        System.out.print("Nome: ");
        objCao2.nome = leia.next();
        System.out.print("Raça: ");
        objCao2.raca = leia.next();
        System.out.print("Cor: ");
        objCao2.cor = leia.next();
        System.out.print("Sexo: ");
        objCao2.sexo = leia.next();
        System.out.print("Porte: ");
        objCao2.porte = leia.next();
        System.out.print("Idade: ");
        objCao2.idade = leia.nextByte();
        System.out.print("Dono: ");
        objCao2.dono = leia.next();
        
        System.out.println("Dados do Cão 1:");
        System.out.print("Nome: "+objCao1.nome);
        System.out.print("Raça: "+objCao1.raca);
        System.out.print("Cor: "+objCao1.cor);
        System.out.print("Sexo: "+objCao1.sexo);
        System.out.print("Porte: "+objCao1.porte);
        System.out.print("Idade: "+objCao1.idade);
        System.out.print("Dono: "+objCao1.dono);
        
        System.out.println("Dados do Cão 2:");
        System.out.print("Nome: "+objCao2.nome);
        System.out.print("Raça: "+objCao2.raca);
        System.out.print("Cor: "+objCao2.cor);
        System.out.print("Sexo: "+objCao2.sexo);
        System.out.print("Porte: "+objCao2.porte);
        System.out.print("Idade: "+objCao2.idade);
        System.out.print("Dono: "+objCao2.dono);
        
    }
}