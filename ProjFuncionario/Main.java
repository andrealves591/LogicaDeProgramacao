import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite o Nome do Funcionário: ");
    String nome = leia.nextLine();
    System.out.print("Digite o Nº do RG: ");
    String rg = leia.next();
    System.out.print("Digite o Nº do CPF: ");
    String cpf = leia.next();
    System.out.print("Digite o Cargo do Funcionário: ");
    String cargo = leia.next();
    System.out.print("Digite o Sexo: ");
    String sexo = leia.next();
    System.out.print("Digite a Quantidade de Filhos: ");
    int qtdFilhos = leia.nextInt();
    System.out.print("Digite a Quantidade de Dependentes: ");
    int qtdDependentes = leia.nextInt();
    System.out.print("Digite a Carga Horária: ");
    double cargaHoraria = leia.nextDouble();
    System.out.print("Digite o Valor-Hora: R$ ");
    double valorHora = leia.nextDouble();
    
    double salBruto = valorHora*cargaHoraria;
    double valeTransporte = salBruto*0.06;
    double inss = salBruto*0.11;
    double salFamilia = salBruto*0.03*qtdFilhos;
    double planoSaude = salBruto*0.01*qtdDependentes;
    double salLiquido = salBruto-valeTransporte-inss+salFamilia-planoSaude;
    
    System.out.println("Nome do Funcionário: "+nome);
    System.out.println("Nº do CPF: "+cpf);
    System.out.println("Nº do RG: "+rg);
    System.out.println("Cargo do Funcionário: "+cargo);
    System.out.println("Sexo: "+sexo);
    System.out.println("Quantidade de Filhos: "+qtdFilhos);
    System.out.println("Quantidade de Dependentes: "+qtdDependentes);
    System.out.println("Quantidade de Horas Trabalhadas:"+cargaHoraria+" h");
    System.out.println("Valor-Hora: R$ "+valorHora);
    System.out.println("Valor do Salário Bruto: R$ "+salBruto);
    System.out.println("Valor do Vale Transporte: R$ "+valeTransporte);
    System.out.println("Valor do INSS: R$ "+inss);
    System.out.println("Valor Salário Família: R$ "+salFamilia);
    System.out.println("Valor do Plano de Saúde: R$ "+planoSaude);
    System.out.println("Valor do Salário Líquido: R$ "+salLiquido);
    
    }
}