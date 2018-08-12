import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        
        String nome;
        double valorPassagem;
        float valorHora;
        double horasTrabalhadas;
        double salarioBruto;
        double valeTransporte;
        byte opcao;
        double insalubridade;
        double inss;
        String resposta;
        
        System.out.println(":::Informe os Dados do Funcinário:::");
        System.out.print("Nome: ");
        nome = leia.nextLine();
        System.out.print("Valor Total da Passagem: R$ ");
        valorPassagem = leia.nextDouble();
        System.out.print("Valor Hora: R$ ");
        valorHora = leia.nextFloat();
        System.out.print("Total de Horas Trabalhadas: ");
        horasTrabalhadas = leia.nextDouble();
        
        salarioBruto = valorHora*horasTrabalhadas;
        
        if(salarioBruto*0.06 > valorPassagem){
            valeTransporte = valorPassagem;
        }else{
            valeTransporte = salarioBruto*0.06;
        }
        
        do{
            
            System.out.println(":::::OPÇÃO DE INSALUBRIDADE:::::");
            System.out.println("ESCOLHA UMA OPÇÃO ABAIXO");
            System.out.println("1 - MÍNIMO");
            System.out.println("2 - MÉDIO");
            System.out.println("3 - MÁXIMO");
            System.out.print("Digite aqui a opção desejada: ");
            opcao = leia.nextByte();
            switch(opcao){
                case 1:
                    insalubridade = 1103.66*0.1;
                    break;
                case 2:
                    insalubridade = 1103.66*0.2;
                    break;
                case 3:
                    insalubridade = 1103.66*0.4;
                    break;
                default:
                    insalubridade = 0;
                    System.out.print("OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
            }
        }while(opcao<1 || opcao>3);
        
        if(salarioBruto<=1556.94){
            inss = salarioBruto*0.08;
        }else if(salarioBruto<=2594.92){
            inss = salarioBruto*0.09;
        }else{
            inss = salarioBruto*0.11;
        }
        
        double salarioLiquido = salarioBruto+insalubridade-inss-valeTransporte;
        
        do{
            System.out.println("::::::::::INFORMAÇÕES DO FUNCIONÁRIO::::::::::");
            System.out.println("1 - MOSTRAR TODOS OS DADOS DO FUNCIONÁRIO");
            System.out.println("2 - VER DESCONTOS");
            System.out.println("3 - VER BENEFÍCIOS");
            System.out.println("4 - VER SALÁRIO LÍQUIDO");
            System.out.println("0 - ENCERRAR");
            System.out.print("Digite aqui a opção desejada: ");
            byte opcao2 = leia.nextByte();
            switch(opcao2){
                case 1:
                    resposta = "Nome: "+nome+"\nValor Passagem: R$ "+valorPassagem+"\nValor VT: R$ "+valeTransporte+"\nValor hora: R$ "+valorHora+"\nHoras Trabalhadas: "+horasTrabalhadas+"h"+"\nSalário Bruto: R$ "+salarioBruto+"\nInsalubridade: R$ "+insalubridade+"\nINSS: R$ "+inss+"\nSalário Líquido: R$ "+salarioLiquido;
                    break;
                case 2:
                    resposta = "INSS: R$ "+inss+"\nVT: R$ "+valeTransporte;
                    break;
                case 3:
                    resposta = "Insalubridade: R$ "+insalubridade;
                    break;
                case 4:
                    resposta = "Salário Líquido: R$ "+salarioLiquido;
                    break;
                case 0:
                    resposta = "SISTEMA ENCERRADO!";
                    break;
                default:
                    resposta = "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!";
                    break;
            }
            System.out.println(resposta);
        }while(opcao!=0);
    }
}