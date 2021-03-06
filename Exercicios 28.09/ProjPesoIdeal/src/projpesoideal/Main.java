package projpesoideal;//CRIAÇÃO DO PACOTE "projpesoideal", AQUI ESTÃO CONTIDAS TODAS AS CLASSES DO PROJETO 
//LINHA EM BRANCO IGNORADA PELO PROGRAMA
import java.util.Scanner;//IMPORTAÇÃO DA CLASSE SCANNER, PARA QUE POSSAMOS OS MÉTODOS NELA CONTIDAS, E FAZER COM QUE O USUÁRIO INTERAJA COM O PROGRAMA
//LINHA EM BRANCO IGNORADA PELO PROGRAMA
public class Main {//CRIAÇÃO DA CLASSE Main, A CLASSE PRINCIPAL, DENTRO DELA TEMOS O MÉTODO main, QUE É RESPONSÁNVEL PELA EXECUÇÃO DO PROGRAMA, POR ISSO ESSA CLASSE É A PRINCIPAL
//LINHA EM BRANCO IGONRADA PELO PROGRAMA
    public static void main(String[] args) {//CRIAÇÃO DO MÉTODO main, O RESPONSÁVEL PELA EXECUÇÃO DO PROGRAMA
        Scanner leia = new Scanner(System.in);//INSTANCIAMENTO DA CLASSE SCANNER, CRIANDO O OBJETO leia, PARA QUE POSSAMOS USAR O MÉTODO next, E PODER RECEBER DADOS DO USUÁRIO
        Pessoa objPessoa = new Pessoa();//INSTANCIAMENTO DA CLASSE PESSOA, PARA QUE POSSAMOS USAR OS MÉTODOS NELA CONTIDAS
        //LINHA EM BRANCO IGNORADA PELO PROGRAMA
        System.out.println("INSIRA OS DADOS DA PESSOA");//LEGENDA PARA INFORMAR AO USUÁRIO QUE ELE PRECISA INTERAGIR COM O PROBLEMA
        System.out.print("Altura: ");//PEDE AO USUÁRIO QUE ELE DIGITE SUA ALTURA
        objPessoa.setAltura(leia.nextDouble());//AQUI É LIDA A ALTURA ATRAVÉS DO MÉTODO next, E ATRAVÉS DO MÉTODO set, É JOGADA PARA A CLASSE PESSOA
        System.out.print("Sexo [1]=HOMEM & [2]=MULHER: ");//PEDE AO USUÁRIO QUE DIGITE O SEU SEXO
        objPessoa.setSexo(leia.nextByte());//AQUI É LIDO O SEXO ATRAVÉS DO MÉTODO next, E ATRAVÉS DO MÉTODO set, É JOGADA PARA A CLASSE PESSOA
        System.out.print("Peso atual: ");//PEDE AO USUÁRIO QUE ELE DIGITE SEU PESO ATUAL
        objPessoa.setPesoAtual(leia.nextDouble());//AQUI É LIDO O PESO ATUAL ATRAVÉS DO MÉTODO next, E ATRAVÉS DO MÉTODO set, É JOGADA PARA A CLASSE PESSOA
        //LINHA EM BRANCO IGNORADA PELO PROGRAMA
        System.out.println(objPessoa+"\n"//MOSTRA OS DADOS DO OBJETO PESSOA
                            +"Peso ideal: "+objPessoa.calcularPesoIdeal()+"\n"//MOSTRA O PESO IDEAL DA PESSOA ATRAVÉS DO MÉTODO calcularPesoIdeal
                            + "Você está "+objPessoa.verificarPeso());//MOSTRA SE A PESSOA ESTÁ ACIMA DO PESO, ABAIXO DO PESO OU NO PESO IDEAL
    }//FIM DO MÉTODO main
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
}//FIM DA CLASSE Main
