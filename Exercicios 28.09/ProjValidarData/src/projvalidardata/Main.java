package projvalidardata;//CRIAÇÃO DO PACOTE "projvalidardata", TODAS AS CLASSES CRIADAS SERÃO ARMAZENADAS NESTE PACOTE
//LINHA EM BRANCO IGNORADA PELO PROGRAMA
import java.util.Scanner;//IMPORTAÇÃO DA CLASSE SCANNER, PARA QUE O USUÁRIO POSSA INTERAGIR COM O PROGRAMA, ATRAVÉS DO MÉTODO next
//LINHA EM BRANCO IGNORADA PELO PROGRAMA
public class Main {//CRIAÇÃO DA CLASSE MAIN, A CLASSE PRINCIPAL PORQUE NELA TEM O MÉTODO main, QUE É O RESPONSÁVEL PELA EXECUÇÃO DO PROGRAMA
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public static void main(String[] args) {//CRIAÇÃO DO MÉTODO main, O RESPONSÁVEL PELA EXECUÇÃO DO PROGRAMA
        Scanner leia = new Scanner(System.in);//INSTANCIAMENTO DA CLASSE SCANNER, CRIAÇÃO DO OBJETO leia, PARA QUE POSSA SER USADO O MÉTODO next, E QUE O USUÁRIO POSSA INSERIR INFORMAÇÕES DO TRIÂNGULO
        Data objData = new Data();//INSTANCIAMENTO DA CLASSE DATA, CRIA O OBEJTO objData PARA QUE SE POSSA USAR OS MÉTODOS DA CLASSE
        //LINHA EM BRANCO IGNORADA PELO PROGRAMA
        System.out.println("::::::::::VALIDAÇÃO DE DATA::::::::::");//LEGENDA QUE INFORMA AO USUÁRIO QUE O PROGRAMA É UMA VALIDAÇÃO DE DATA
        System.out.print("Digite o dia: ");//PEDE AO USUÁRIO QUE DIGITE O DIA
        objData.setDia(leia.nextByte());//AQUI É LIDO O DIA, E ATRAVÉS DO MÉTODO set, ELE É JOGADA NA CLASSE DATA
        System.out.print("Digite o mês: ");//PEDE AO USUÁRIO QUE DIGITE O MÊS
        objData.setMes(leia.nextByte());//AQUI É LIDO O MÊS, E ATRAVÉS DO MÉTODO set, ELE É JOGADA NA CLASSE DATA
        System.out.print("Digite o ano: ");//PEDE AO USUÁRIO QUE DIGITE O ANO
        objData.setAno(leia.nextInt());//AQUI É LIDO O ANO, E ATRAVÉS DO MÉTODO set, ELE É JOGADA NA CLASSE DATA
        //LINHA EM BRANCO IGNORADA PELO PROGRAMA
        System.out.println(objData);//MOSTRA AS INFORMAÇÕES DO objData
    }//FIM DO MÉTODO main
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
}//FIM DA CLASSE MAIN
